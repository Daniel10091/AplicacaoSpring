package com.ceub.aplicacaoteste.repository;

import com.ceub.aplicacaoteste.model.Cliente;
import com.ceub.aplicacaoteste.model.Pedido;
import com.ceub.aplicacaoteste.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);

    List<Pedido> findByVendedor(Vendedor vendedor);

    List<Pedido> findByNumero(Integer numero);

}
