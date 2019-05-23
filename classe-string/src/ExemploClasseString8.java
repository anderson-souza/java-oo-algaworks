
public class ExemploClasseString8 {

	public static void main(String[] args) {
		String s = "Java";
		int indice = s.indexOf("a");
		System.out.println(indice);

		String email = "joao@joao.com";
		int indexEmail = email.indexOf("@");

		System.out.println(indexEmail);

		indice = s.lastIndexOf('a');
		System.out.println(indice);
	}

}
