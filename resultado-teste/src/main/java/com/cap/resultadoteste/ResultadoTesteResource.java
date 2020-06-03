package com.cap.resultadoteste;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.resultadoteste.model.Resultado;
import com.cap.resultadoteste.repositorio.Repositorio;

@RestController
@RequestMapping("/")
public class ResultadoTesteResource {
	
	@Autowired 
	private Repositorio repositorio;
	
	@PostMapping
	public @ResponseBody String add(@RequestBody Resultado req) {
		repositorio.save(req);
		return "save sucessfull";
	}
	
	@PutMapping
	public @ResponseBody String update(@RequestBody Resultado req) {
		repositorio.save(req);
		return "update sucessfull";
	}
	
	@GetMapping
	public @ResponseBody Iterable<Resultado> getAllResultado() {
		return repositorio.findAll();
		
	}
	
	@GetMapping(path="/nomeTeste/{nomeTeste}")
	public @ResponseBody Iterable<Resultado> getAllCustumer1(@PathVariable("nomeTeste") String nomeTeste) {
			return repositorio.findAllCustumer(nomeTeste, null, null, null);
		
	}
	
	@GetMapping(path="/nomeCandidato/{nomeCandidato}")
	public @ResponseBody Iterable<Resultado> getAllCustumer2(@PathVariable("nomeCandidato") 
		String nomeCandidato) {
			return repositorio.findAllCustumer(null, nomeCandidato, null, null);
		
	}
	
	@GetMapping(path="/pencentualAcerto/{pencentualAcerto}")
	public @ResponseBody Iterable<Resultado> getAllCustumer3(@PathVariable("pencentualAcerto") 
		BigDecimal pencentualAcerto) {
			return repositorio.findAllCustumer(null, null, pencentualAcerto, null);
		
	}
	
	@GetMapping(path="/nomeDocumento/{nomeDocumento}")
	public @ResponseBody Iterable<Resultado> getAllCustumer4(@PathVariable("nomeDocumento") 
		String nomeDocumento) {
			return repositorio.findAllCustumer(null, null, null, nomeDocumento);
		
	}

}
