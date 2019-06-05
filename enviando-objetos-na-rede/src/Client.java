import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("localhost", 3333);

		OutputStream saida = socket.getOutputStream();
		ObjectOutput objectOutput = new ObjectOutputStream(saida);

		Pedido pedido = new Pedido();
		pedido.setCodigo(1L);
		pedido.setDescricao("Sabonete");
		pedido.setQuantidade(5);

		objectOutput.writeObject(pedido);

		InputStream entrada = socket.getInputStream();
		DataInputStream dataInput = new DataInputStream(entrada);
		System.out.println("Recebeu do servidor: " + dataInput.readUTF());

		socket.close();
	}

}
