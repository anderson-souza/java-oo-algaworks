package com.algaworks.cursojava.financeiro.modelo;

public class Conta {

	private String descricao;
	private double valor;
	private String dataVencimento;
	protected SituacaoConta situacaoConta;

	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	public void cancelar() {
		if (situacaoConta != SituacaoConta.PENDENTE) {
			System.out.println("N�o � poss�vel cancelar esta conta!");
			return;
		}
		System.out.println();
		System.out.println("INFORMA��ES DA CONTA CANCELADA");
		System.out.println("Desci��o: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("Data de Vencimento: " + dataVencimento);
		this.situacaoConta = SituacaoConta.CANCELADA;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

}
