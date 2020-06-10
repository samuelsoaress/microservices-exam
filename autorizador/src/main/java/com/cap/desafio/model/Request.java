package com.cap.desafio.model;

public class Request {
	private String nome;
	
	private String email;

	private int codigoProva;

	private String tempoRestante;

	private String emailGestor;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
