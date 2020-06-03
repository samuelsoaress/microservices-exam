package com.cap.composicaoprova.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "composicao_prova")
public class ComposicaoProva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	private String nomeTeste;
	private String codigoProva;
	private Integer sequencialProva;
	private String tecnologia;
	private String complexidade;
	private Integer quantidadeQuestoes;
	
	
	public String getCodigoProva() {
		return codigoProva;
	}
	public void setCodigoProva(String codigoProva) {
		this.codigoProva = codigoProva;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNomeTeste() {
		return nomeTeste;
	}
	public void setNomeTeste(String nomeTeste) {
		this.nomeTeste = nomeTeste;
	}
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
