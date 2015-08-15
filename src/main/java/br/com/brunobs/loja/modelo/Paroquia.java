package br.com.brunobs.loja.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.brunobs.loja.framework.RecursoList;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Paroquia {

	private Long id = 0l;
	private String nome;
	private Cidade cidade;
	private String urlGrupos;

	@RecursoList(nomeAtributoParaURL = "urlGrupos", nomeAtributoIDPai = "id", recurso = "paroquias/{id}/grupos")
	private List<Grupo> grupos = new ArrayList<Grupo>();

	public Paroquia(String nome, Cidade cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}

	public Paroquia() {
		super();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrlGrupos() {
		return this.urlGrupos;
	}

	public void setUrlGrupos(String urlGrupos) {
		this.urlGrupos = urlGrupos;
	}

	public Cidade getCidade() {
		return this.cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public List<Grupo> getGrupos() {
		return this.grupos;
	}

	public void addGrupo(Grupo grupo) {
		this.grupos.add(grupo);
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	public String toJson() {
		return new Gson().toJson(this);
	}

	public String toJson(List<Paroquia> paroquias) {
		return new Gson().toJson(paroquias);
	}

	public String toXML() {
		return new XStream().toXML(this);
	}

	public String toXML(List<Paroquia> paroquias) {
		return new XStream().toXML(paroquias);
	}

}
