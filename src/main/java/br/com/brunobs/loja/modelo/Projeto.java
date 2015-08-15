package br.com.brunobs.loja.modelo;

import com.thoughtworks.xstream.XStream;

public class Projeto {
	private String nome;
	private long id;
	private int anoDeInicio;

	public Projeto(long id, String nome, int anoDeInicio) {
		this.anoDeInicio = anoDeInicio;
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAnoDeInicio() {
		return this.anoDeInicio;
	}

	public void setAnoDeInicio(int anoDeInicio) {
		this.anoDeInicio = anoDeInicio;
	}

	public String toXML() {
		return new XStream().toXML(this);
	}
}
