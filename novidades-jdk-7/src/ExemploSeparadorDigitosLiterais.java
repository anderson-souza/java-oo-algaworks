
public class ExemploSeparadorDigitosLiterais {

	public static void main(String[] args) {

		long populacaoSaoPaulo = 11_000_000L;
		long populacaoGrandeSaoPaulo = 11_000_000 + 9_000_000;

		System.out.printf("População São Paulo: %d\n", populacaoSaoPaulo);
		System.out.printf("População Grande São Paulo: %d\n", populacaoGrandeSaoPaulo);

		double precoVeiculo = 200_000.99_1d;
		System.out.println("Preço veículo: " + precoVeiculo);

		int x = 1___2___3;
		int y = 1_2_3;
		System.out.println("Iguais?: " + (x == y));
	}

}
