package com.cap.candidatos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cap.candidatos.model.Candidatos;

public interface Repositorio extends CrudRepository<Candidatos, Integer> {

	@Query(value = "SELECT * FROM Candidatos u WHERE "
			   + "u.email = :email "
			+ "or u.nome_candidato = :nomeCandidato "
			+ "or u.aprovado = :aprovado "
			+ "or u.contratado = :contratado", nativeQuery = true)
	List<Candidatos> findAllCustumer(@Param("email") 
		String email, @Param("nomeCandidato") 
		String nomeCandidato, @Param("aprovado") 
		String aprovado, @Param("contratado") 
		String contratado);


}