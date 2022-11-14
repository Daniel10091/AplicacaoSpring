package com.ceub.aplicacaoteste.dto;

import com.ceub.aplicacaoteste.model.Cliente;
import com.ceub.aplicacaoteste.model.Pedido;
import com.ceub.aplicacaoteste.model.Vendedor;

import java.util.List;
import java.util.stream.Collectors;

public class PedidoDto {

    private Cliente cliente;
    private Vendedor vendedor;

    public PedidoDto() {}

    public PedidoDto(Pedido pedido) {
        this.cliente = pedido.getCliente();
        this.vendedor = pedido.getVendedor();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public static List<PedidoDto> converterPedido(List<Pedido> pedidos) {
        return pedidos.stream().map(PedidoDto::new).collect(Collectors.toList());
    }

}
