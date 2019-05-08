package com.algaworks.curso.fjoo.heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		Jogador jogador = new Jogador();
		jogador.nome = "Viadão";
		jogador.idade = 33;
		jogador.seApresentar();
		jogador.dizerSeAindaJoga();
		
		Pessoa p = new Pessoa();
	}
	
}
