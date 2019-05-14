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
			System.out.println("A Conta \"" + getDescricao() + "\" não está pendente e não pode ser paga");
			return;
		}
		System.out.println();
		System.out.println("INFORMAÇÕES DA CONTA PAGA");
		System.out.println("Descição: " + getDescricao());
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
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("Data de Vencimento: " + getDataVencimento());
		System.out.println("Situação da conta: " + getSituacaoConta());
		System.out.println();
	}	

}
