package com.manage.clients.Controller;

import com.manage.clients.Models.Clients;
import com.manage.clients.Service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientsController {

    @Autowired
    private ClientsService clientsService;

    @GetMapping("/get")
    public List<Clients> getListClients(){
        return clientsService.getListCLients();
    }

    @PostMapping("/add")
    public Clients addClient(@RequestBody Clients clients){
        return clientsService.addClient(clients);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Integer id){
        clientsService.deleteClient(Long.valueOf(id));
    }
}
