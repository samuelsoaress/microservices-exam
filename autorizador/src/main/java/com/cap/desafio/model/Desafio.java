package com.cap.desafio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Desafio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	
	private String nome;

	private String email;

	private String autorizador;

	private int codigoProva;

	private String tempoRestante;

	private String emailGestor;

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

	public String getAutorizador() {
		return autorizador;
	}

	public void setAutorizador(String autorizador) {
		this.autorizador = autorizador;
	}

	public int getCodigoProva() {
		return codigoProva;
	}

	public void setCodigoProva(int codigoProva) {
		this.codigoProva = codigoProva;
	}

	public String getTempoRestante() {
		return tempoRestante;
	}

	public void setTempoRestante(String tempoRestante) {
		this.tempoRestante = tempoRestante;
	}

	public String getEmailGestor() {
		return emailGestor;
	}

	public void setEmailGestor(String emailGestor) {
		this.emailGestor = emailGestor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
