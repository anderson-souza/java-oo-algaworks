package com.algaworks;

public class Fibonacci {

	// F(n) = F(n-1) + F(n-2)
	public long calcular(long posicao) {

		if (posicao <= 1) {
			return posicao;
		}

		return calcular(posicao - 1) + calcular(posicao - 2);
	}

}
