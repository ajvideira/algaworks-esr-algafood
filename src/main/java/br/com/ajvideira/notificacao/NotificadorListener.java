package br.com.ajvideira.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.ajvideira.service.ClienteAtivadoEvent;

@Component
public class NotificadorListener {

	@TipoDeNotificador(NivelUrgencia.NORMAL)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
	}
	
}
