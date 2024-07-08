package com.manage.clients.Repository;

import com.manage.clients.Models.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Clients, Long> {
}
