
public class TesteCorreioEletronico {

	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();

		// correio.enviarEmails(new String[] { "joão@joão.com", "maria@maria.com" });

		correio.enviarEmails("joão@joão.com", "maria@maria.com", "pedro@pedro.com");
	}

}
