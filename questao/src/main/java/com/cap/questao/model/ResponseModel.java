package com.cap.questao.model;

import java.util.ArrayList;
import java.util.List;

public class ResponseModel {
	private Integer code;
	private String complexity;
	private String firstPart;
	private String codeParts;
	private String correctAnswer;
	private String technology;
	private List<Answers> answers = new ArrayList<Answers>();
	
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public List<Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getComplexity() {
		return complexity;
	}
	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}
	public String getFirstPart() {
		return firstPart;
	}
	public void setFirstPart(String firstPart) {
		this.firstPart = firstPart;
	}
	public String getCodeParts() {
		return codeParts;
	}
	public void setCodeParts(String codeParts) {
		this.codeParts = codeParts;
	}
	
}
