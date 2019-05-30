package com.algaworks.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.algaworks.modelo.Cliente;

public class ClienteDAO {

	private static Logger logger = LogManager.getLogger(ClienteDAO.class);

	public void salvar(Cliente cliente) {
		if (cliente == null) {
			logger.warn("Cliente está nulo");
			return;
		}
		if (logger.isDebugEnabled()) {
			logger.debug("Salvando o cliente: " + cliente);

			logger.debug("Cliente Salvo com Sucesso");
		}
	}
}
