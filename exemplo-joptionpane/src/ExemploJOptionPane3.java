import javax.swing.JOptionPane;

public class ExemploJOptionPane3 {

	public static void main(String[] args) {

		Object[] opcoes = { "Sim", "N�o", "Sim, com e-mail" };

		int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Voc� gostaria de finalizar o cadastro?",
				"Confirma��o", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2]);

		System.out.println("Op��o Selecionada: " + opcaoSelecionada);

		switch (opcaoSelecionada) {
		case 1:

			break;

		default:
			break;
		}
	}

}
