package com.algaworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Memoria {

	private List<Object> lista = new ArrayList<>();

	public static void main(String[] args) {
		Memoria memoria = new Memoria();

		try {
			int opcao = 0;
			do {
				Scanner entrada = new Scanner(System.in);
				System.out.println("Informe uma opção: ");
				opcao = entrada.nextInt();
				if (opcao == 1) {
					for (int i = 0; i < 2_000_000; i++) {
						memoria.lista.add(new Object());
					}
				}
			} while (opcao != 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
