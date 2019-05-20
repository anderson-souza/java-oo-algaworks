package com.algaworks.curso.fjoo.collections;

import java.util.Set;

public class TesteSetHashSet2 {

	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBancoDeDados.bucarAlunos();

		Aluno alunoSorteado = new Aluno("Maria");

		if (alunos.contains(alunoSorteado)) {
			System.out.println("Parab�ns " + alunoSorteado.getNome() + "! Voc� ganhou um brinde!");
		} else {
			System.out.println("Aluno n�o cadastrado no banco de dados");
		}
	}

}
