package com.alga.curso;

import java.util.ArrayList;
import java.util.List;

import com.alga.curso.modelo.Cliente;
import com.alga.curso.modelo.Endereco;
import com.alga.curso.modelo.Telefone;
import com.google.gson.Gson;

public class GerandoJson {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua das alamedas, 10", "Ribeirão Preto", "SP");

		Telefone residencial = new Telefone("RESIDENCIAL", "11 123456789");
		Telefone comercial = new Telefone("COMERCIAL", "11 12345579679");

		List<Telefone> telefones = new ArrayList<>();
		telefones.add(residencial);
		telefones.add(comercial);

		Cliente cliente = new Cliente("João das Neves", 28, endereco, telefones);

		Gson gson = new Gson();
		String json = gson.toJson(cliente);

		System.out.println(json);

		Cliente c2 = gson.fromJson(json, Cliente.class);
		System.out.println(c2.getNome());
		System.out.println(c2.getTelefone().get(0).getNumero());
	}

}
