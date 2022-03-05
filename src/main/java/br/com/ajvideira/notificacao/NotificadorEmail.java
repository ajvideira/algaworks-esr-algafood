package br.com.ajvideira.notificacao;

import org.springframework.stereotype.Component;

import br.com.ajvideira.model.Cliente;

@Component
public class NotificadorEmail {

	public NotificadorEmail() {
		System.out.println("NotificadorEmail");
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
