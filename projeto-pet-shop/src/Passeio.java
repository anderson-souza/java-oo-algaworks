
public class Passeio {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Anderson";
		p1.cachorro = new Cachorro();
		p1.cachorro.nome = "Bidu";
		p1.cachorro.idade = 2;
		p1.cachorro.raca = "Pitbull";
		p1.cachorro.sexo = 'F';
		
		Caminhada c = new Caminhada();
		c.andar(p1);

	}

}
