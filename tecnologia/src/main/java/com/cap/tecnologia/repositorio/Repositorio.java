package com.cap.tecnologia.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.cap.tecnologia.model.Tecnologia;

public interface Repositorio extends CrudRepository<Tecnologia, Integer> {

}