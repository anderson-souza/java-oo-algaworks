package com.algaworks.teste;

import com.algaworks.caixa.Checkout;
import com.algaworks.caixa.Compra;
import com.algaworks.impressao.Impressora;
import com.algaworks.impressao.impressoras.ImpressoraEpson;
import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Operadora;
import com.algaworks.pagamento.operadoras.Cielo;

public class TesteCheckout {

	public static void main(String[] args) {
		Operadora operadora = new Cielo();
		Impressora impressora = new ImpressoraEpson();

		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João das neves");
		cartao.setNumeroCartao("123");

		Compra compra = new Compra();
		compra.setNomeCliente("Joaquim");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);

		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}

}
