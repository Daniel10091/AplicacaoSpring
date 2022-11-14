package com.ceub.aplicacaoteste.repository;

import com.ceub.aplicacaoteste.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {

    List<Vendedor> findByNome(String nome);

    List<Vendedor> findByFaixaComissao(String faixaComissao);

    List<Vendedor> findByNumero(Integer numero);

    List<Vendedor> findByFaixa_comissao(String valor);

}
