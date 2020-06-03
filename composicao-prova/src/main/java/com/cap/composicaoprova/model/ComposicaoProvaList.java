package com.cap.composicaoprova.model;

import java.util.List;

public class ComposicaoProvaList {
	
	
	private String nomeTeste;
	private String codigoProva;
	private List<Composicao> list;
	public String getNomeTeste() {
		return nomeTeste;
	}
	public void setNomeTeste(String nomeTeste) {
		this.nomeTeste = nomeTeste;
	}
	public String getCodigoProva() {
		return codigoProva;
	}
	public void setCodigoProva(String codigoProva) {
		this.codigoProva = codigoProva;
	}
	public List<Composicao> getList() {
		return list;
	}
	public void setList(List<Composicao> list) {
		this.list = list;
	}
	
	
	
}
