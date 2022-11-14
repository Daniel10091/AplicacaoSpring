package com.ceub.aplicacaoteste.dto;

import com.ceub.aplicacaoteste.model.Vendedor;

import java.util.List;
import java.util.stream.Collectors;

public class VendedorDto {

    private String nome;

    private String faixa_comissao;

    public VendedorDto() {}

    public VendedorDto(Vendedor vendedor) {
        this.nome = vendedor.getNome();
        this.faixa_comissao = vendedor.getFaixa_comissao();
    }

    public String getNome() {
        return nome;
    }

    public String getFaixa_comissao() {
        return faixa_comissao;
    }

    public static List<VendedorDto> converterProduto(List<Vendedor> vendedores) {
        return vendedores.stream().map(VendedorDto::new).collect(Collectors.toList());
    }

}
