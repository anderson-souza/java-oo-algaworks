
public class TesteConstrutor {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Anderson",25);
		
		System.out.println("Nome: \""+p1.nome + "\" tem " + p1.idade + " anos");

		p1.nome = "João";
		p1.idade = 25;
		
		System.out.println("Nome: \""+p1.nome + "\" tem " + p1.idade + " anos");
		
		Pessoa p2 = new Pessoa("Maria");
		System.out.println("Nome: \""+p2.nome + "\" tem " + p2.idade + " anos");
	}

}
