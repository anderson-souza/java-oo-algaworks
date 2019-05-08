
public class Carro {

	String fabricante = "Sem fabricante";
	String modelo;
	String cor; // null
	int anoDeFabricacao = 2011; // 0
	boolean biCombustivel = true; // False

	Proprietario dono = new Proprietario();

	void ligar() {
		if(modelo == null) {
			return;
		}
		System.out.println("Ligando o carro " + modelo);
	}
	
	public void alterarModelo(String modelo) {
		if (modelo != null) {
			this.modelo = modelo;
		}
	}

}
