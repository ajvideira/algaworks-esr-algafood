package br.com.ajvideira.notificacao;

import org.springframework.stereotype.Component;

import br.com.ajvideira.model.Cliente;

@TipoDeNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {

		System.out.printf("Notificando %s através do telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
