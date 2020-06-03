package com.cap.tecnologia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.tecnologia.model.Tecnologia;
import com.cap.tecnologia.repositorio.Repositorio;

@RestController
@RequestMapping("/")
public class TecnologiaResource {
	
	@Autowired 
	private Repositorio repositorio;
	
	@PostMapping
	public @ResponseBody String add(@RequestBody Tecnologia req) {
		repositorio.save(req);
		return "save sucessfull";
	}
	
	@PutMapping
	public @ResponseBody String update(@RequestBody Tecnologia req) {
		repositorio.save(req);
		return "update sucessfull";
	}
	
	@DeleteMapping(path="/codigo/{codigo}")
	public @ResponseBody String delete(@PathVariable("codigo") Integer codigo) {
		Tecnologia param = new Tecnologia();
		param.setCodigo(codigo);
		repositorio.delete(param);
		return "delete sucessfull";
	}
	
	@GetMapping
	public @ResponseBody Iterable<Tecnologia> getAllTecnologia() {
		return repositorio.findAll();
		
	}

}
