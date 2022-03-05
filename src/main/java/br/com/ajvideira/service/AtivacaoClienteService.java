package br.com.ajvideira.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ajvideira.model.Cliente;
import br.com.ajvideira.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private List<Notificador> notificadores;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificadores.forEach(notificador -> notificador.notificar(cliente, "Seu cadastro no sistema está ativo!"));
	}
	
}
