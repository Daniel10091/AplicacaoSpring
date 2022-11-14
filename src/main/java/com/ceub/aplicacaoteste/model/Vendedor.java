package com.ceub.aplicacaoteste.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vendedor {
	@Id
	private Integer cod_vendedor;
	private String nome;
	private float salario;
	private String faixa_comissao;
	@OneToMany(mappedBy = "vendedor")
	private List<Pedido> pedidos;

	public Integer getCod_vendedor() {
		return cod_vendedor;
	}

	public void setCod_vendedor(Integer cod_vendedor) {
		this.cod_vendedor = cod_vendedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFaixa_comissao() {
		return faixa_comissao;
	}

	public void setFaixa_comissao(String faixa_comissao) {
		this.faixa_comissao = faixa_comissao;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
