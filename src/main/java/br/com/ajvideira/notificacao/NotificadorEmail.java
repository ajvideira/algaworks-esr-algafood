package br.com.ajvideira.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import br.com.ajvideira.model.Cliente;

@Profile("prod")
@TipoDeNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {

		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
