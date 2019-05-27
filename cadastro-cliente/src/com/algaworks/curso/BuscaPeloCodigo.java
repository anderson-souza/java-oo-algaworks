package com.algaworks.curso;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOFactory;
import com.algaworks.curso.modelo.Cliente;

public class BuscaPeloCodigo {

	public static void main(String[] args) {

		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDao();
		Cliente cliente = clienteDAO.buscarPeloCodigo(3L);

		if (cliente != null) {
			System.out.println("-----Cliente Encontrado------");
			System.out.printf("Código: %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		} else {
			System.out.println("Nenhum cliente encontrado");
		}
	}

}
