import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmails {

	public static void main(String[] args) {

		String[] emails = { "joao@joao.com", "maria@maria.com", "ricardo@ricardo.com" };

		// try (BufferedWriter writer = new BufferedWriter(new FileWriter("email.txt",
		// true))) {
		try (PrintStream writer = new PrintStream("email2.txt")) {
			for (String email : emails) {
				// writer.write(email);
				// writer.newLine();
				writer.println(email);

			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
