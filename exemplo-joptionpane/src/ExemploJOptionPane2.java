import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExemploJOptionPane2 {

	public static void main(String[] args) throws Exception {

		JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso");

		JOptionPane.showMessageDialog(null, "Atenção - email não informado", "Atenção", JOptionPane.WARNING_MESSAGE);

		JOptionPane.showMessageDialog(null, "Erro no sistema", "Error", JOptionPane.ERROR_MESSAGE);

		JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);

		URL url = ExemploJOptionPane2.class.getResource("algaworks.png");
		Icon icone = new ImageIcon(url);

		JOptionPane.showMessageDialog(null, "Obrigado por escolher a Algaworks", "Algaworks",
				JOptionPane.INFORMATION_MESSAGE, icone);
	}

}
