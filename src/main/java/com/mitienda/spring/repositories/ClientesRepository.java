package com.mitienda.spring.repositories;

import org.springframework.data.repository.CrudRepository;


import com.mitienda.spring.models.Clientes;

import java.util.List;

public interface ClientesRepository extends CrudRepository<Clientes, Long> {

    List<Clientes> findByName(String name);

}
