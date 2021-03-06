package br.com.ajvideira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.ajvideira.model.Cliente;
import br.com.ajvideira.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

	AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("João", "joao@email.com", "987766567");
		
		ativacaoClienteService.ativar(joao);
		
		return "Hello!";
	}
	
}
