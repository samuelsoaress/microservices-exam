package com.cap.desafio.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cap.desafio.model.Desafio;

public interface Repositorio extends CrudRepository<Desafio, Integer> {

	@Query(value = "SELECT * FROM Desafio u WHERE u.autorizador = :autorizador and u.email = :email", nativeQuery = true)
	List<Desafio> findAllCustumer(@Param("autorizador") String autorizador, @Param("email") String email);

}