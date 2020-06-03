package com.cap.questao.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cap.questao.model.Questao;

public interface Repositorio extends CrudRepository<Questao, Integer> {

	@Query(value = "SELECT * FROM Questao u WHERE u.nome_teste = :nomeTeste", nativeQuery = true)
	List<Questao> findAllCustumer( @Param("nomeTeste") String nomeTeste);

}