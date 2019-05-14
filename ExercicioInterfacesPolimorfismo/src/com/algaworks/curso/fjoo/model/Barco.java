package com.algaworks.curso.fjoo.model;

import com.algaworks.curso.fjoo.interfaces.Seguravel;

public class Barco implements Seguravel {

	private double valorMercado;
	private int anoFabricacao;

	public Barco(double valorMercado, int anoFabricacao) {
		super();
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado;
		if (anoFabricacao < 2005) {
			valorApolice *= 0.05;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Barco fabricado em " + anoFabricacao + " e com valor de mercado de " + valorMercado;
	}

}
