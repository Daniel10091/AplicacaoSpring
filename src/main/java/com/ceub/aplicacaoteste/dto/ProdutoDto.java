package com.ceub.aplicacaoteste.dto;

import com.ceub.aplicacaoteste.model.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoDto {
    private String descricao;
    private float valor;

    public ProdutoDto() {}

    public ProdutoDto(Produto produto) {
        this.descricao = produto.getDescricao();
        this.valor = produto.getValor();
    }

    public String getDescription() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public static List<ProdutoDto> converterProduto(List<Produto> produtos) {
        return produtos.stream().map(ProdutoDto::new).collect(Collectors.toList());
    }

}
