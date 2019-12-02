package com.mitienda.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mitienda.spring.models.Factura;


import java.util.List;

public interface FacturasRepository extends CrudRepository<Factura, Long> {

    List<Factura> findByName(String name);

}
