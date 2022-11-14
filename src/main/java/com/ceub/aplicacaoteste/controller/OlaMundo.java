package com.ceub.aplicacaoteste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Controller com passagem de página
@Controller
public class OlaMundo {
	
	@RequestMapping("/")
	@ResponseBody //Força a passagem de informações e não de uma página
	public String ola() {
		return "Olá Mundo! Boa noite turma!!!!";
	}
	
}
