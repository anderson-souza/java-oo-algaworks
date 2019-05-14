package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar extends Conta {

	private Fornecedor fornecedor;

	public ContaPagar() {
		super();
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this();
		this.setFornecedor(fornecedor);
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public void pagar() {
		if(getSituacaoConta() != SituacaoConta.PENDENTE) {
			System.out.println();
			System.out.println("A Conta \"" + getDescricao() + "\" n�o est� pendente e n�o pode ser paga");
			return;
		}
		System.out.println();
		System.out.println("INFORMA��ES DA CONTA PAGA");
		System.out.println("Desci��o: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("Data de Vencimento: " + getDataVencimento());
		System.out.println("Fornecedor: " + getFornecedor().getNome());
		this.situacaoConta = SituacaoConta.PAGA;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Detalhamento da Conta a Pagar");
		System.out.println("Fornecedor: " + getFornecedor().getNome());
		System.out.println("Descri��o: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("Data de Vencimento: " + getDataVencimento());
		System.out.println("Situa��o da conta: " + getSituacaoConta());
		System.out.println();
	}	

}
