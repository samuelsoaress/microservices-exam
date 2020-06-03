package com.cap.resultadoteste.repositorio;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cap.resultadoteste.model.Resultado;

public interface Repositorio extends CrudRepository<Resultado, Integer> {
	
	@Query(value = "SELECT * FROM Resultado u WHERE "
			   + "u.nome_teste = :nomeTeste "
			+ "or u.nome_candidato = :nomeCandidato "
			+ "or u.pencentual_acerto = :pencentualAcerto "
			+ "or u.nome_documento = :nomeDocumento", nativeQuery = true)
	List<Resultado> findAllCustumer(@Param("nomeTeste") 
		String nomeTeste, @Param("nomeCandidato") 
		String nomeCandidato, @Param("pencentualAcerto") 
		BigDecimal pencentualAcerto, @Param("nomeDocumento") 
		String nomeDocumento);

}