package com.cap.desafio;

import java.util.Base64;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.desafio.model.Desafio;
import com.cap.desafio.model.Message;
import com.cap.desafio.model.Request;
import com.cap.desafio.repositorio.Repositorio;

@RestController
@RequestMapping("/")
public class DesafioResource {

	@Autowired 
	private Repositorio repositorio;
	
	@PostMapping
	public @ResponseBody Message addDesafio(@RequestBody Request autorizador) {
		Desafio model = new Desafio();
		model.setAutorizador(Base64.getEncoder().encodeToString(String.valueOf(
				new Date().getTime()).getBytes()));
		model.setNome(autorizador.getNome());
		model.setCodigoProva(autorizador.getCodigoProva());
		model.setEmail(autorizador.getEmail());
		model.setEmailGestor(autorizador.getEmailGestor());
		model.setTempoRestante(autorizador.getTempoRestante());
		repositorio.save(model);
		
		Message message = new Message();
		message.setAutorizador(model.getAutorizador());
		message.setMessage("save sucessfull");
		return message;
		
	}
	
	@GetMapping
	public @ResponseBody Iterable<Desafio> getAllDesafio() {
		return repositorio.findAll();
		
	}
	
	@GetMapping(path="/{autorizador}/email/{email}")
	public ResponseEntity<Iterable<Desafio>>  getAllDesafio(@PathVariable("autorizador") String autorizador, 
			@PathVariable("email") String email) {
		
		List<Desafio> list = repositorio.findAllCustumer(autorizador, email);
		if(list.isEmpty()) {
			return new ResponseEntity<Iterable<Desafio>>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Iterable<Desafio>>(list, HttpStatus.OK);
		}
		
	}
}
