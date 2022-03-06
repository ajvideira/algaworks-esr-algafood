package br.com.ajvideira.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import br.com.ajvideira.model.Cliente;

@Component
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		applicationEventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Construindo bean");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destruindo bean");
	}
	
}
