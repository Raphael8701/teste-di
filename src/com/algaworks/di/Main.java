package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {
	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@.com", "99999999");
		Notificador notificador = new NotificadorEmail();
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
	}
}
