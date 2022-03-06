package br.com.ajvideira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import br.com.ajvideira.model.Cliente;
import br.com.ajvideira.notificacao.NivelUrgencia;
import br.com.ajvideira.notificacao.Notificador;
import br.com.ajvideira.notificacao.TipoDeNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDeNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
