package com.ceub.aplicacaoteste.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {

	@Id
	private Integer numero;
	private Integer prazo_entrega;
	@ManyToOne
	@JoinColumn(name = "cod_cliente")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "cod_vendedor")
	private Vendedor vendedor;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getPrazo_entrega() {
		return prazo_entrega;
	}

	public void setPrazo_entrega(Integer prazo_entrega) {
		this.prazo_entrega = prazo_entrega;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

}
