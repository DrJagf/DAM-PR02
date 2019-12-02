package com.mitienda.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mitienda.spring.models.Producto;


import java.util.List;

public interface ProductosRepository extends CrudRepository<Producto, Long> {

    List<Producto> findByName(String name);

}
