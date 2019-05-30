package com.algaworks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.algaworks.dao.ClienteDAO;
import com.algaworks.modelo.Cliente;

public class ExemploSalvandoCliente {

	private static Logger logger = LogManager.getLogger(ExemploSalvandoCliente.class);

	public static void main(String[] args) {
		logger.info("Iniciando a aplicação");

		Cliente cliente = new Cliente("João");
		new ClienteDAO().salvar(cliente);

		new ClienteDAO().salvar(null);

		logger.info("Finalizando a Aplicação");
	}

}
