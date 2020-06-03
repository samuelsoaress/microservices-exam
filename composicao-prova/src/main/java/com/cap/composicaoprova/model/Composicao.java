package com.cap.composicaoprova.model;

public class Composicao {
	
	private Integer sequencialProva;
	private String tecnologia;
	private String complexidade;
	private Integer quantidadeQuestoes;
	
	public Integer getSequencialProva() {
		return sequencialProva;
	}
	public void setSequencialProva(Integer sequencialProva) {
		this.sequencialProva = sequencialProva;
	}
	public String getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	public String getComplexidade() {
		return complexidade;
	}
	public void setComplexidade(String complexidade) {
		this.complexidade = complexidade;
	}
	public Integer getQuantidadeQuestoes() {
		return quantidadeQuestoes;
	}
	public void setQuantidadeQuestoes(Integer quantidadeQuestoes) {
		this.quantidadeQuestoes = quantidadeQuestoes;
	}

}
