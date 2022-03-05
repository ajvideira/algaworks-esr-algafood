package br.com.ajvideira.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.ajvideira.notificacao.Notificador;
import br.com.ajvideira.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
		return ativacaoClienteService;
	}
	
}
