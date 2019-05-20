package com.algaworks.curso.fjoo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TesteNumeros {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ ###,###,##0.00"); // # é usado para parâmetros opcionais
		double valorProduto = 1300000.59;
		// R$ 1.300,59

		System.out.println(formatador.format(valorProduto));

		String entrada = "R$ 50,34";
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println("Número: " + numero);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
		}

		BigDecimal bg = new BigDecimal(500D);

	}

}
