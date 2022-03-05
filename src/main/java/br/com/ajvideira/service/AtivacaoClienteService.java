package br.com.ajvideira.service;

import br.com.ajvideira.model.Cliente;
import br.com.ajvideira.notificacao.Notificador;

public class AtivacaoClienteService {

	Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
