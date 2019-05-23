import javax.swing.JOptionPane;

public class ExemploJOptionPane4 {

	public static void main(String[] args) {

		Object[] possibilidades = { "Masculino", "Feminino" };
		String sexo = (String) JOptionPane.showInputDialog(null, "Selecione o Sexo", "AlgaWorks",
				JOptionPane.PLAIN_MESSAGE, null, possibilidades, possibilidades[0]);

		System.out.println("Sexo selecionado: " + sexo);

		String nome = (String) JOptionPane.showInputDialog(null, "Digite seu Nome", "AlgaWorks",
				JOptionPane.PLAIN_MESSAGE, null, null, null);

		System.out.println("Seu nome é: " + nome);
	}

}
