package com.cap.questao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	private String descricaoQuestao;
	private String blocoCodigo;
	private String complexidade;
	private String codigoTecnologia;
	private String codigoRespostaCorreta;
	private String altenativaA;
	private String altenativaB;
	private String altenativaC;
	private String altenativaD;
	private String altenativaE;
	
	public String getComplexidade() {
		return complexidade;
	}
	public void setComplexidade(String complexidade) {
		this.complexidade = complexidade;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricaoQuestao() {
		return descricaoQuestao;
	}
	public void setDescricaoQuestao(String descricaoQuestao) {
		this.descricaoQuestao = descricaoQuestao;
	}
	public String getBlocoCodigo() {
		return blocoCodigo;
	}
	public void setBlocoCodigo(String blocoCodigo) {
		this.blocoCodigo = blocoCodigo;
	}
	public String getCodigoTecnologia() {
		return codigoTecnologia;
	}
	public void setCodigoTecnologia(String codigoTecnologia) {
		this.codigoTecnologia = codigoTecnologia;
	}
	public String getCodigoRespostaCorreta() {
		return codigoRespostaCorreta;
	}
	public void setCodigoRespostaCorreta(String codigoRespostaCorreta) {
		this.codigoRespostaCorreta = codigoRespostaCorreta;
	}
	public String getAltenativaA() {
		return altenativaA;
	}
	public void setAltenativaA(String altenativaA) {
		this.altenativaA = altenativaA;
	}
	public String getAltenativaB() {
		return altenativaB;
	}
	public void setAltenativaB(String altenativaB) {
		this.altenativaB = altenativaB;
	}
	public String getAltenativaC() {
		return altenativaC;
	}
	public void setAltenativaC(String altenativaC) {
		this.altenativaC = altenativaC;
	}
	public String getAltenativaD() {
		return altenativaD;
	}
	public void setAltenativaD(String altenativaD) {
		this.altenativaD = altenativaD;
	}
	public String getAltenativaE() {
		return altenativaE;
	}
	public void setAltenativaE(String altenativaE) {
		this.altenativaE = altenativaE;
	}
	
}
