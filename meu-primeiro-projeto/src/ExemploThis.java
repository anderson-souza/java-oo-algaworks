
public class ExemploThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro = new Carro();
		carro.modelo = "Palio";
		System.out.println("Modelo antes: " + carro.modelo);
		carro.alterarModelo("Civic");
		System.out.println("Modelo depois: " + carro.modelo);
	}

}
