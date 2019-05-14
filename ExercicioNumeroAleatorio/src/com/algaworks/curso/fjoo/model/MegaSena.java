package com.algaworks.curso.fjoo.model;

import java.util.ArrayList;
import java.util.Collections;

public class MegaSena {

	private int quantidadeJogos;

	public MegaSena(int quantidadeJogos) {
		this.quantidadeJogos = quantidadeJogos;
	}

	public void jogar() {
		for (int i = 0; i < this.quantidadeJogos; i++) {
			ArrayList<Integer> numerosSorteados = new ArrayList<Integer>();

			int j = 0;
			while (j < 6) {
				int numeroSorteado = (int) Math.round(Math.random() * 60);
				// System.out.println("Numero sorteado: " + numeroSorteado);
				if (!numerosSorteados.contains(numeroSorteado)) {
					numerosSorteados.add(numeroSorteado);
					j++;
				}
			}
			Collections.sort(numerosSorteados);
			System.out.println(numerosSorteados);
		}
	}

}
