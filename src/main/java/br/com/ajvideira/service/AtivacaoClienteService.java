package br.com.ajvideira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ajvideira.model.Cliente;
import br.com.ajvideira.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	//@Autowired
	private Notificador notificador;
	
	@Autowired
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}
	
	public AtivacaoClienteService(String teste) {
		
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
	//@Autowired
	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}
	
}
