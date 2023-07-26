package service;

import modelo.Cliente;
import notificacao.Notificador;

public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void ativar(Cliente cliente) {
		
		cliente.ativar();
		
		this.notificador.notificar(cliente, "Seu cadastro no sistema est� ativo!");
	}

}
