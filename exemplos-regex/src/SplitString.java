
public class SplitString {

	public static void main(String[] args) {
		String texto = "O4Java1é333uma9linguagem9orientada1a8objetos.";

		String[] palavras = texto.split("\\d+");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}

}
