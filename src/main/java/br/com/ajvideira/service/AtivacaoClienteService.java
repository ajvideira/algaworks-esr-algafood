package br.com.ajvideira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import br.com.ajvideira.model.Cliente;
import br.com.ajvideira.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Qualifier("sms")
	@Autowired
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
