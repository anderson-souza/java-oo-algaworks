
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// obt�m a quantidade de produtos que o usu�rio deseja informar
		System.out.println("Quantos produtos?");
		int quantidadeProdutos = entrada.nextInt();

		// Precisamos dessa linha extra para garantir que uma nova linha seja lida,
		// pois nextInt n�o l� uma nova linha, mas apenas um n�mero.
		// Fica feio, mas tente n�o coloca-la para ver o que acontece.
		entrada.nextLine();

		// instancia um objeto da classe Estoque
		Estoque estoque = new Estoque();

		// instancia um array de produtos com a quantidade de
		// posi��es que o usu�rio informou
		estoque.produtos = new Produto[quantidadeProdutos];

		// percorre todas as posi��es no array (que est�o nulas)
		// e preenche uma por uma com a entrada do teclado do usu�rio
		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();

			System.out.println("\nProduto " + i);
			System.out.println("------------------------");

			System.out.println("Descri��o:");
			estoque.produtos[i].descricao = entrada.nextLine();

			System.out.println("Quantidade de itens:");
			estoque.produtos[i].quantidade = entrada.nextInt();
			entrada.nextLine();
		}

		estoque.listarProdutos();
	}

}
