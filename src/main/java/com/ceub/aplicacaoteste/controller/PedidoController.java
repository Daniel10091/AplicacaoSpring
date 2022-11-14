package com.ceub.aplicacaoteste.controller;

import com.ceub.aplicacaoteste.dto.PedidoDto;
import com.ceub.aplicacaoteste.model.Pedido;
import com.ceub.aplicacaoteste.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PedidoController {

    @Autowired
    PedidoRepository pedidoRepository;

    @RequestMapping("/pedidos")
    public List<PedidoDto> listarPedidos(Integer numero) {
        List<Pedido> pedidos;
        if (numero == null) {
            pedidos = pedidoRepository.findAll();
        } else {
            pedidos = pedidoRepository.findByNumero(numero);
        }
        return PedidoDto.converterPedido(pedidos);
    }

    @RequestMapping("/pedidos_completo")
    public List<Pedido> listarPedidosCompleto() {
        List<Pedido> pedidos = pedidoRepository.findAll();
        return pedidos;
    }

}
