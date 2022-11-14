package com.ceub.aplicacaoteste.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	@Id
	private Integer cod_cliente;
	private String nome;
	private String endereco;
	private String cidade;
	private Integer cep;
	private String uf;
	private String cnpj;
	private Integer ie;
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Integer getIe() {
		return ie;
	}
	public void setIe(Integer ie) {
		this.ie = ie;
	}
	public Integer getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(Integer cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
}
