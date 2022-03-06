package br.com.ajvideira.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import br.com.ajvideira.model.Cliente;

@Primary
@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {

		System.out.printf("Notificando %s através do telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
