package br.com.ajvideira.notificacao;

import br.com.ajvideira.model.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}