package com.algaworks.curso.fjoo.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {

	public static void main(String[] args) {
		
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = "Caixa de F�sforo";
		pp.dataValidade = new Date();
		pp.identificar();

	}

}
