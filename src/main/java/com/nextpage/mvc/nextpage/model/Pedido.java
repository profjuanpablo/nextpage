package com.nextpage.mvc.nextpage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public String titulo;
	public String autor; 
	public String categoria; 
	public String editora; 
	public String qtdPagina; 
	public String capa; 

	public Double Valor;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getQtdPagina() {
		return qtdPagina;
	}
	public void setQtdPagina(String qtdPagina) {
		this.qtdPagina = qtdPagina;
	}
	public String getCapa() {
		return capa;
	}
	public void setCapa(String capa) {
		this.capa = capa;
	}
	public Double getValor() {
		return Valor;
	}
	public void setValor(Double valor) {
		Valor = valor;
	} 
	
	
	
}
