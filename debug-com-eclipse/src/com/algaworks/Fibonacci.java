package com.algaworks;

public class Fibonacci {

	// F(n) = F(n-1) + F(n-2)
	public static long calcula(long posicao) {
		if (posicao == 0 || posicao == 1) {
			return posicao;
		}
		long valor1 = calcula(posicao - 1);
		long valor2 = calcula(posicao - 2);
		return valor1 + valor2;
	}

}
