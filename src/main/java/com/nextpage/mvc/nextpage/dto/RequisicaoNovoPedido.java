package com.nextpage.mvc.nextpage.dto;

import com.nextpage.mvc.nextpage.model.Pedido;

public class RequisicaoNovoPedido {

	private String titulo;
	private String autor; 
	private String categoria; 
	private String editora; 
	private String qtdPagina; 
	private String capa; 
	private Double Valor;
	
	
	


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





	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setTitulo(titulo);
		pedido.setAutor(autor);
		pedido.setCategoria(categoria);
		pedido.setEditora(editora);
		pedido.setQtdPagina(qtdPagina);
		pedido.setCapa(capa);
		pedido.setValor(Valor);
		
		return pedido;
	}
	
	
}
