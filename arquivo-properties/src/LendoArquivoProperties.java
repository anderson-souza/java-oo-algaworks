import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LendoArquivoProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("./config/config.properties"));

		// Configuração
		String url = prop.getProperty("banco.dados.url");
		String usuario = prop.getProperty("banco.dados.usuario");
		String senha = prop.getProperty("banco.dados.senha");

		System.out.println("URL: " + url);
		System.out.println("Usuário: " + usuario);

		try {
			int x = 5 / 0;
		} catch (Exception e) {
			String email = prop.getProperty("email.admin");
			System.err.println("Enviando email para: " + email + " informando o erro: " + e.getMessage());
		}
	}

}
