import java.io.BufferedReader;
import java.io.FileReader;

public class EnviandoEmails {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader("email2.txt"))) {

			String email = null;
			while ((email = reader.readLine()) != null) {
				System.out.println("Enviando e-mail para : " + email);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
