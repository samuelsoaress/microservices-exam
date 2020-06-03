package com.cap.composicaoprova.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cap.composicaoprova.model.ComposicaoProva;

public interface Repositorio extends CrudRepository<ComposicaoProva, Integer> {

	@Query(value = "SELECT * FROM composicao_prova u WHERE u.nome_teste = :nomeTeste", nativeQuery = true)
	List<ComposicaoProva> findAllCustumer( @Param("nomeTeste") String nomeTeste);
	
	@Query(value = "SELECT * FROM composicao_prova u WHERE u.codigo_prova = :codigoProva", nativeQuery = true)
	List<ComposicaoProva> findAllCodigoProva( @Param("codigoProva") String codigoProva);
	
	@Query(value = "SELECT * FROM composicao_prova u GROUP BY u.nome_teste", nativeQuery = true)
	List<ComposicaoProva> findAllGroupByName();
	
	Long deleteByCodigoProva(String codigoProva);
}