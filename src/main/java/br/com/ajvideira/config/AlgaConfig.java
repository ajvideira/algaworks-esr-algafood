package br.com.ajvideira.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.ajvideira.notificacao.NotificadorEmail;
import br.com.ajvideira.service.AtivacaoClienteService;

@Configuration
public class AlgaConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificadorEmail());
		return ativacaoClienteService;
	}
	
}
