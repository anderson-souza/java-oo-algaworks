
public class TesteCorreioEletronico {

	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();

		// correio.enviarEmails(new String[] { "jo�o@jo�o.com", "maria@maria.com" });

		correio.enviarEmails("jo�o@jo�o.com", "maria@maria.com", "pedro@pedro.com");
	}

}
