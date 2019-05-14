package com.algaworks.pagamento.operadoras;

import com.algaworks.pagamento.Autorizavel;
import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Operadora;

public class RedeCard implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("456") && autorizavel.getValorTotal() < 200;
	}

}
