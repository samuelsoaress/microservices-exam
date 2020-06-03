package com.cap.questao;

import java.util.ArrayList;
import java.util.List;

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

import com.cap.questao.model.Answers;
import com.cap.questao.model.Questao;
import com.cap.questao.model.ResponseModel;
import com.cap.questao.repositorio.Repositorio;

@RestController
@RequestMapping("/")
public class QuestaoResource {
	
	@Autowired 
	private Repositorio repositorio;
	
	@PostMapping
	public @ResponseBody String add(@RequestBody Questao req) {
		repositorio.save(req);
		return "save sucessfull";
	}
	
	
	@PostMapping("/addAll")
	public @ResponseBody String addAll(@RequestBody List<ResponseModel> req) {
		
		for (ResponseModel item : req) {
			Questao questao = new Questao();
			questao.setDescricaoQuestao(item.getFirstPart());
			questao.setBlocoCodigo(item.getCodeParts());
			questao.setComplexidade(item.getComplexity());
			questao.setCodigoTecnologia(item.getTechnology());
			questao.setCodigoRespostaCorreta(item.getCorrectAnswer());
			questao.setAltenativaA(item.getAnswers().get(0).getText());
			questao.setAltenativaB(item.getAnswers().get(1).getText());
			questao.setAltenativaC(item.getAnswers().get(2).getText());
			questao.setAltenativaD(item.getAnswers().get(3).getText());
			if(item.getAnswers().size() > 4) {
				questao.setAltenativaE(item.getAnswers().get(4).getText());
			}
			repositorio.save(questao);
		}
		
		return "save sucessfull";
	}
	
	@PutMapping
	public @ResponseBody String update(@RequestBody Questao req) {
		repositorio.save(req);
		return "update sucessfull";
	}
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Questao> getAll() {
		return repositorio.findAll();
	}
	
	@GetMapping
	public @ResponseBody Iterable<ResponseModel> getAllCostumer() {
		List<ResponseModel> response = new ArrayList<ResponseModel>();
		ResponseModel model = null;
		Iterable<Questao> list  = repositorio.findAll();
		
		for (Questao questao : list) {
			model = new ResponseModel();
			model.setAnswers(new ArrayList<>());
			model.setCode(questao.getCodigo());
			model.setCodeParts(questao.getBlocoCodigo());
			model.setComplexity(questao.getComplexidade());
			model.setFirstPart(questao.getDescricaoQuestao());
			model.setTechnology(questao.getCodigoTecnologia());
			model.setCorrectAnswer(questao.getCodigoRespostaCorreta());
			Answers answers = null;
			
			if(questao.getAltenativaB() !=  null) {
				answers = new Answers();
				answers.setLetter("A");
				answers.setText(questao.getAltenativaA());
				model.getAnswers().add(answers);
			}
			
			if(questao.getAltenativaB() !=  null) {
				answers = new Answers();
				answers.setLetter("B");
				answers.setText(questao.getAltenativaB());
				model.getAnswers().add(answers);
			}
			
			if(questao.getAltenativaC() !=  null) {
				answers = new Answers();
				answers.setLetter("C");
				answers.setText(questao.getAltenativaC());
				model.getAnswers().add(answers);
			}
			
			if(questao.getAltenativaD() !=  null) {
				answers = new Answers();
				answers.setLetter("D");
				answers.setText(questao.getAltenativaD());
				model.getAnswers().add(answers);
			}
			
			if(questao.getAltenativaE() !=  null) {
				answers = new Answers();
				answers.setLetter("E");
				answers.setText(questao.getAltenativaE());
				model.getAnswers().add(answers);
			}
			response.add(model);
		}
		return response;
	}
	
	@DeleteMapping(path="/codigo/{codigo}")
	public @ResponseBody String delete(@PathVariable("codigo") Integer codigo) {
		Questao param = new Questao();
		param.setCodigo(codigo);
		repositorio.delete(param);
		return "delete sucessfull";
	}

}
