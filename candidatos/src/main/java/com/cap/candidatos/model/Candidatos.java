package com.cap.candidatos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidatos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	private String email;
	private String nomeCandidato;
	private String telefone;
	private String aprovado;
	private String contratado;
	private String parecerEntrevista;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomeCandidato() {
		return nomeCandidato;
	}
	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getAprovado() {
		return aprovado;
	}
	public void setAprovado(String aprovado) {
		this.aprovado = aprovado;
	}
	public String getContratado() {
		return contratado;
	}
	public void setContratado(String contratado) {
		this.contratado = contratado;
	}
	public String getParecerEntrevista() {
		return parecerEntrevista;
	}
	public void setParecerEntrevista(String parecerEntrevista) {
		this.parecerEntrevista = parecerEntrevista;
	}
	

}
