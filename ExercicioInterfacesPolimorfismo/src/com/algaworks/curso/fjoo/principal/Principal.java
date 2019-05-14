package com.algaworks.curso.fjoo.principal;

import com.algaworks.curso.fjoo.model.Barco;
import com.algaworks.curso.fjoo.model.Carro;
import com.algaworks.curso.fjoo.model.CorretoraSeguros;
import com.algaworks.curso.fjoo.model.Imovel;
import com.algaworks.curso.fjoo.model.Notebook;

public class Principal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();

		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000, 320);
		Barco meuBarco = new Barco(50000, 1990);
		Notebook notebook = new Notebook(1500, 5);

		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(meuBarco);
		corretora.fazerPropostaSeguro(notebook);
	}

}
