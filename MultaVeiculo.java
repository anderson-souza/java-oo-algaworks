import java.util.Scanner;

public class MultaVeiculo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Tipo do veículo (passeio, caminhao): ");
		String tipoVeiculo = entrada.nextLine();
		
		System.out.print("Velocidade máxima da via: ");
		int velocidadeMaxima = entrada.nextInt();
		
		System.out.println("Velocidade do veiculo");
		int velocidadeVeiculo = entrada.nextInt();
		
		if (tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) {
			System.out.println("Multa");
		} else if (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05) {
			System.out.println("Multa");
		}
		
	}
}