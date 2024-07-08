package com.manage.clients.Service;

import com.manage.clients.Models.Clients;
import com.manage.clients.Repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ClientsService {
    @Autowired
    private ClientsRepository clientsRepository;
    private List<Clients> listCLients;

    public List<Clients> getListCLients(){
        return clientsRepository.findAll();
    }

    public Clients addClient(@RequestBody Clients clients){
        return clientsRepository.save(clients);
    }

    public void deleteClient(Long id){
        clientsRepository.deleteById(id);
    }
}
