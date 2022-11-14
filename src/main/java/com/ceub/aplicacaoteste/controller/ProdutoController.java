package com.ceub.aplicacaoteste.controller;

import com.ceub.aplicacaoteste.dto.ProdutoDto;
import com.ceub.aplicacaoteste.model.Produto;
import com.ceub.aplicacaoteste.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @RequestMapping("/produtos")
    public List<ProdutoDto> listarProdutos(Integer numero) {
        List<Produto> produtos;
        if (numero == null) {
            produtos = produtoRepository.findAll();
        } else {
            produtos = produtoRepository.findByPedidos_Numero(numero);
        }
        return ProdutoDto.converterProduto(produtos);
    }

    @RequestMapping("/produtos_completo")
    public List<Produto> listarProdutosCompleto() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }

}
