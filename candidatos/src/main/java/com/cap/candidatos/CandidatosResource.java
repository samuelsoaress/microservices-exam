package com.cap.candidatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.candidatos.model.Candidatos;
import com.cap.candidatos.repositorio.Repositorio;

@RestController
@RequestMapping("/")
public class CandidatosResource {
	
	@Autowired 
	private Repositorio repositorio;
	
	@PostMapping
	public @ResponseBody String add(@RequestBody Candidatos req) {
		repositorio.save(req);
		return "save sucessfull";
	}
	
	@PutMapping
	public @ResponseBody String update(@RequestBody Candidatos req) {
		repositorio.save(req);
		return "update sucessfull";
	}
	
	@GetMapping
	public @ResponseBody Iterable<Candidatos> getAllDesafio() {
		return repositorio.findAll();
	}
	
	@GetMapping(path="/email/{email}")
	public @ResponseBody Iterable<Candidatos> getAllCustumer1(@PathVariable("email") String email) {
			return repositorio.findAllCustumer(email, null, null, null);
		
	}
	
	@GetMapping(path="/nomeCandidato/{nomeCandidato}")
	public @ResponseBody Iterable<Candidatos> getAllCustumer2(@PathVariable("nomeCandidato") String nomeCandidato) {
			return repositorio.findAllCustumer(null, nomeCandidato, null, null);
		
	}
	
	@GetMapping(path="/aprovado/{aprovado}")
	public @ResponseBody Iterable<Candidatos> getAllCustumer3(@PathVariable("aprovado") String aprovado) {
			return repositorio.findAllCustumer(null, null, aprovado, null);
		
	}
	
	@GetMapping(path="/contratado/{contratado}")
	public @ResponseBody Iterable<Candidatos> getAllCustumer4(@PathVariable("contratado") String contratado) {
			return repositorio.findAllCustumer(null, null, null, contratado);
		
	}

}
