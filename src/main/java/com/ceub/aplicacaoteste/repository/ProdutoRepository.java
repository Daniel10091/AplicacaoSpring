package com.ceub.aplicacaoteste.repository;

import com.ceub.aplicacaoteste.model.Cliente;
import com.ceub.aplicacaoteste.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    // List<Produto> findByUnidade(String unidade);

    List<Produto> findByDescricao(String descricao);

    List<Produto> findByPedidosNumero(Integer numero);

    List<Produto> findByPedidos_Numero(Integer numero);

}
