package com.algaworks.cursojava.financeiro.modelo;

public class ContaReceber extends Conta {

	private Cliente cliente;
	
	public ContaReceber() {
		super();
	}
	
	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
		this();
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	@Override
	public void cancelar() {
		if(this.getValor() >= 50000) {
			System.out.println("Conta possui valor maior que 50 mil e n�o pode ser cancelada");
			return;
		}
		super.cancelar();
	}
	
	public void receber() {
		if(getSituacaoConta() != SituacaoConta.PENDENTE) {
			System.out.println();
			System.out.println("A Conta \"" + getDescricao() + "\" n�o est� pendente e n�o pode ser recebida");
			return;
		}
		System.out.println();
		System.out.println("INFORMA��ES DA CONTA RECEBIDA");
		System.out.println("Desci��o: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("Data de Vencimento: " + getDataVencimento());
		System.out.println("Fornecedor: " + getCliente().getNome());
		this.situacaoConta = SituacaoConta.PAGA;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
	
}
