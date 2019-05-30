package com.algaworks.curso.modelo;

/**
 * Representa um funcionário da empresa
 * 
 * @author Anderson Souza
 * @author João das Neves
 *
 */
public class Funcionario {

	private String nome;
	private double salario;

	/**
	 * Não utilize mais, pois o salário é obrigatório para outros métodos.
	 * 
	 * @deprecated
	 * @param nome
	 */
	public Funcionario(String nome) {
		this.nome = nome;
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Calcula o adiantamento em dinheiro que deverá ser pago ao funcionário.
	 * 
	 * <p>
	 * O valor da diária é calculado didivindo-se o <b>salário base por 30 (dias do
	 * mês)</b>.
	 * </p>
	 * 
	 * Caso o destino for uma capital, é adicionado 20% no valor do adiantamento.
	 * 
	 * @param dias    Quantidade de dias da viagem
	 * 
	 * @param capital Indica se é ou não uma capital brasileira
	 * @return O valor em reais do adiantamento
	 * 
	 * @since 1.1.0
	 * 
	 * @throws IllegalArgumentException Caso {@code dias} for menor ou igual a zero.
	 * 
	 * @see Viagem
	 */
	public double adiantamentoViagem(int dias, boolean capital) {

		if (dias <= 0) {
			throw new IllegalArgumentException("Dias devem ser maior que zero");
		}

		double valorDiaria = salario / 30;
		double valorAdiantamento = valorDiaria * dias;

		if (capital) {
			valorAdiantamento *= 1.20;
		}

		return valorAdiantamento;
	}

}
