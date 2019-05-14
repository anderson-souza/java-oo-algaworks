package com.algaworks.curso.fjoo.model;

import com.algaworks.curso.fjoo.interfaces.Seguravel;

public class Carro implements Seguravel {

	private double valorMercado;
	private int anoFabricacao;

	public Carro(double valorMercado, int anoFabricacao) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.04;
		if (anoFabricacao < 2000) {
			valorApolice = valorApolice * 0.90;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Carro ano " + this.anoFabricacao + " com valor de mercado " + this.valorMercado;
	}

}
