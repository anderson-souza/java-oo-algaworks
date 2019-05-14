package com.algaworks.curso.fjoo.model;

import com.algaworks.curso.fjoo.interfaces.Seguravel;

public class Notebook implements Seguravel {

	private double valorMercado;
	private int anosDeUso;

	public Notebook(double valorMercado, int anosDeUso) {
		super();
		this.valorMercado = valorMercado;
		this.anosDeUso = anosDeUso;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.015;
		valorApolice *= anosDeUso;
		return valorApolice;
	}

	@Override
	public String obterDescricao() {

		return "Notebook com " + anosDeUso + " anos de uso e valor de mercado " + valorMercado;
	}

}
