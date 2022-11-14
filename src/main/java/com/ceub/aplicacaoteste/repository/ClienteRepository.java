package com.ceub.aplicacaoteste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceub.aplicacaoteste.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

	List<Cliente> findByNome(String nome);

	List<Cliente> findByCnpj(String cnpj);

	List<Cliente> findByUf(String uf);

	List<Cliente> findByPedidosNumero(Integer numero);

	List<Cliente> findByPedidos_Numero(Integer numero);

}
