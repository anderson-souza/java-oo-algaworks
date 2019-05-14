package com.algaworks.cursojava.financeiro;

import com.algaworks.cursojava.financeiro.modelo.Conta;

public class RelatorioContas {

	public void exibirListagem(Conta[] contas) {

		for (Conta c : contas) {
			c.exibirDetalhes();
		}
	}

}
