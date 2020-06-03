package com.cap.composicaoprova;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.composicaoprova.model.Composicao;
import com.cap.composicaoprova.model.ComposicaoProva;
import com.cap.composicaoprova.model.ComposicaoProvaList;
import com.cap.composicaoprova.repositorio.Repositorio;

@RestController
@RequestMapping("/")
public class ComposicaoProvaResource {
	
	@Autowired 
	private Repositorio repositorio;
	
	@PostMapping
	public @ResponseBody String add(@RequestBody ComposicaoProva req) {
		repositorio.save(req);
		return "save sucessfull";
	}
	
	@PutMapping
	public @ResponseBody String update(@RequestBody ComposicaoProva req) {
		repositorio.save(req);
		return "update sucessfull";
	}
	
	@GetMapping
	public @ResponseBody List<ComposicaoProvaList> getAllComposicao() {
		List<ComposicaoProvaList> lists = new ArrayList<>();
		ComposicaoProvaList composicaoProvaList = null;
		Iterable<ComposicaoProva> list = repositorio.findAllGroupByName();
		for (ComposicaoProva composicaoProva : list) {
			Iterable<ComposicaoProva> iterable = repositorio.findAllCustumer(composicaoProva.getNomeTeste());
			composicaoProvaList = new ComposicaoProvaList();
			composicaoProvaList.setList(new ArrayList<>());
			for (ComposicaoProva composicao : iterable) {
				Composicao prova = new Composicao();
				composicaoProvaList.setCodigoProva(composicao.getCodigoProva());
				composicaoProvaList.setNomeTeste(composicao.getNomeTeste());
				prova.setComplexidade(composicao.getComplexidade());
				prova.setSequencialProva(composicao.getSequencialProva());
				prova.setTecnologia(composicao.getTecnologia());
				prova.setQuantidadeQuestoes(composicao.getQuantidadeQuestoes());
				composicaoProvaList.getList().add(prova);
			}
			lists.add(composicaoProvaList);
		}
		return lists;
	}
	
	@GetMapping(path="/nomeTeste/{nomeTeste}")
	public @ResponseBody Iterable<ComposicaoProva> getAllCustumer(@PathVariable("nomeTeste") String nomeTeste) {
			return repositorio.findAllCustumer(nomeTeste);
		
	}
	
	@GetMapping(path="/codigoProva/{codigoProva}")
	public @ResponseBody Iterable<ComposicaoProva> getAllCodigoProva(@PathVariable("codigoProva") String codigoProva) {
			return repositorio.findAllCodigoProva(codigoProva);
		
	}
	
	@Transactional
	@DeleteMapping(path="/codigo/{codigoProva}")
    public ResponseEntity<String> delete(@PathVariable("codigoProva") String codigoProva) {
        Long deleted = repositorio.deleteByCodigoProva(codigoProva);
        if(deleted == 0) {         
        	return new ResponseEntity<>(
        	          "Codigo prova nao encontrado",
        	          HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(
  	          "Exame Deletado",
  	          HttpStatus.OK);
    }

}
