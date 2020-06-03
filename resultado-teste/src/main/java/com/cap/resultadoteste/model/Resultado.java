package com.cap.resultadoteste.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;

@Entity
public class Resultado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	private String nomeTeste;
	private String nomeCandidato;
	private Date dataHora;
	@Digits(integer=3, fraction=2)
	private BigDecimal pencentualAcerto;
	private String nomeDocumento;
	
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
	public String getNomeCandidato() {
		return nomeCandidato;
	}
	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public BigDecimal getPencentualAcerto() {
		return pencentualAcerto;
	}
	public void setPencentualAcerto(BigDecimal pencentualAcerto) {
		this.pencentualAcerto = pencentualAcerto;
	}
	public String getNomeDocumento() {
		return nomeDocumento;
	}
	public void setNomeDocumento(String nomeDocumento) {
		this.nomeDocumento = nomeDocumento;
	}
	
}
