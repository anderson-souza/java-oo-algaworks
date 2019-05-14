package com.algaworks.curso.fjoo.classemath;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class TesteClasseMath {

	public static void main(String[] args) {

		// Comprimento de uma circunfer�ncia 2 x r x PI
		int raio = 4;
		double comprimento = 2 * raio * PI;
		System.out.println("Comprimento: " + comprimento);

		// M�ximo e m�nimo
		double[] precoProdutoA = { 30.20, 25.49 };
		System.out.println("Maior pre�o: " + max(precoProdutoA[0], precoProdutoA[1]));
		System.out.println("Menor pre�o : " + Math.min(precoProdutoA[0], precoProdutoA[1]));

		// Pot�ncia
		System.out.println("2 ^ 3 = " + Math.pow(2, 3));

		// Raiz Quadrada
		System.out.println("Raiz de 9: " + Math.sqrt(9));

		// Arredondamento ceil, floor e round
		double n = 5.4;
		System.out.println("Maior inteiro: " + Math.ceil(n));
		System.out.println("Menor inteiro: " + Math.floor(n));
		System.out.println("Arredondar: " + Math.round(n));

		// Trigonometria
		System.out.println("Seno: " + Math.sin(40));

		// N�meros randomicos
		double numeroAleatorio = Math.random() * 100;
		System.out.println((int) numeroAleatorio);

	}

}
