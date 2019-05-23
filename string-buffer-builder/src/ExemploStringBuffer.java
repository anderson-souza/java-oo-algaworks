
public class ExemploStringBuffer {

	public static void main(String[] args) {
		// StringBuffer sb = new StringBuffer(); //thread-safe - use no contexto de
		// concorrência
		StringBuilder sb = new StringBuilder(); // não é thread-safe - mais rápido pois não verifica se há alguém
												// alterando

		sb.append("Bem vindo ao curso de Java. ");
		sb.append("Fique a vontade para tirar suas dúvidas. ");
		sb.append("Estamos aqui para te ajudar. ");
		System.out.println(sb.toString());

		sb.insert(26, " da Algaworks");
		System.out.println(sb.toString());
	}

}
