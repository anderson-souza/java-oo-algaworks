
public class Produto {

	void definirPreco(double precoCusto) {
		precoCusto = precoCusto * 1.20;
	}

	void definirPreco(Preco preco, double percentualImpostos, double margemLucro) {
		preco.valorImpostos = preco.valorCustos * (percentualImpostos / 100);
		preco.valorLucro = preco.valorCustos * (margemLucro / 100);
		preco.precoVenda = preco.valorCustos + preco.valorImpostos + preco.valorLucro;
	}
}
