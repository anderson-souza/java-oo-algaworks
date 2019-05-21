package com.algaworks.curso.fjoo;

import java.util.Scanner;

/**
 * Essa classe é útil para fazer o cálculo do IMC. O IMC é baseado no peso e
 * altura da pessoa.
 * 
 * @author Anderson Souza
 *
 */
public class CalculoIMC {

	/**
	 * O método principal faz o cálculo do IMC.
	 * 
	 * @exception IllegalArgumentException quando não informado o peso.
	 * @param args Recebe a entrada de dados da linha de comando.
	 * @return
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();

		System.out.println();
		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();
		System.out.println();

		double imc = peso / (altura * altura);
		System.out.println("Seu IMC é: " + imc);

	}

}
