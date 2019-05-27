import javax.swing.JOptionPane;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOFactory;
import com.algaworks.curso.modelo.Cliente;

public class SalvaCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		String nome = JOptionPane.showInputDialog(null, "Nome do cliente", "Cadastro de Cliente",
				JOptionPane.QUESTION_MESSAGE);

		if (nome != null) {

			cliente.setNome(nome);

			ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDao();
			clienteDAO.salvar(cliente);
			System.out.println("Cliente salvo com sucesso");
		}
	}

}
