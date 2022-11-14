package com.ceub.aplicacaoteste.controller;

import com.ceub.aplicacaoteste.dto.VendedorDto;
import com.ceub.aplicacaoteste.model.Vendedor;
import com.ceub.aplicacaoteste.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VendedorController {

    @Autowired
    VendedorRepository vendedorRepository;

    @RequestMapping("/vendedores")
    public List<VendedorDto> listarVendedores(String numero) {
        List<Vendedor> vendedores;
        if (numero == null) {
            vendedores = vendedorRepository.findAll();
        } else {
            vendedores = vendedorRepository.findByFaixa_comissao(numero);
        }
        return VendedorDto.converterProduto(vendedores);
    }

    @RequestMapping("/vendedores_completo")
    public List<Vendedor> listarVendedoresCompleto() {
        List<Vendedor> vendedores = vendedorRepository.findAll();
        return vendedores;
    }

}
