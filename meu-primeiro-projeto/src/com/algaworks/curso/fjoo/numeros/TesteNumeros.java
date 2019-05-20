package com.algaworks.curso.fjoo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TesteNumeros {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ ###,###,##0.00"); // # � usado para par�metros opcionais
		double valorProduto = 1300000.59;
		// R$ 1.300,59

		System.out.println(formatador.format(valorProduto));

		String entrada = "R$ 50,34";
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println("N�mero: " + numero);
		} catch (Exception e) {
			System.out.println("Entrada inv�lida");
		}

		BigDecimal bg = new BigDecimal(500D);

	}

}
