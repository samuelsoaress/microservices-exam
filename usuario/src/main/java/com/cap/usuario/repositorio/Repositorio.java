package com.cap.usuario.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.cap.usuario.model.Usuario;

public interface Repositorio extends CrudRepository<Usuario, Integer> {

}