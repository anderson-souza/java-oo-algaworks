package com.alga.curso;

import com.alga.curso.modelo.Cliente;
import com.google.gson.Gson;

public class LendoJson {

	public static void main(String[] args) {

		Gson gson = new Gson();

		String json = "";
		Cliente cliente = gson.fromJson(json, Cliente.class);

	}

}
