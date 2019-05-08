
public class Principal2 {

	public static void main(String[] args) {

		Proprietario dono1 = new Proprietario();
		dono1.nome = "João da Silva";
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";

		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.ligar();
		seuCarro.ligar();
	}

}
