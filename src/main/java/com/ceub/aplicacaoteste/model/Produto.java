package com.ceub.aplicacaoteste.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	private Integer cod_produto;
	private String unidade;
	private String descricao;
	private float valor;

	public Integer getCod_produto() {
		return cod_produto;
	}

	public void setCod_produto(Integer cod_produto) {
		this.cod_produto = cod_produto;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
