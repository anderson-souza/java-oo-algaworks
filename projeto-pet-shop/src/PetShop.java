
public class PetShop {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Lipe";
		cachorro.raca = "Cocker";
		cachorro.sexo = 'M';
		cachorro.idade = 20;

		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("Raça: " + cachorro.raca);
		System.out.println("Sexo: " + cachorro.sexo);
		
	}

}
