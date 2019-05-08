package com.algaworks.curso.fjoo.abstrata;

public class TesteProdutoPerecivel {

	public static void main(String[] args) {
		
		Produto p = new ProdutoPerecivel();
		p.descricao = "Caixa de Leite";
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p;
		pp.dataValidade = "10/03/2019";

		p.imprimirDescricao();
	}

}
