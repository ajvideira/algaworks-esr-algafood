package br.com.ajvideira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ajvideira.model.Cliente;
import br.com.ajvideira.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false)
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		if (this.notificador != null) {			
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		} else {
			System.out.println("Não foi encontrado notificador, mas o cliente foi ativado.");
		}
	}
	
}
