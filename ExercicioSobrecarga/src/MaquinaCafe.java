
public class MaquinaCafe {

	int acucarDisponivel;

	void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("N�o h� a�ucar suficiente para fazer seu caf�");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo um cafezinho com " + quantidadeAcucar + " gramas de a�ucar");
		}
	}

	void fazerCafe() {
		fazerCafe(10);
	}
}
