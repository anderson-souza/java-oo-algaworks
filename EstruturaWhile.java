import java.util.Scanner;

public class EstruturaWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número inicial: ");
		int numeroInicial = entrada.nextInt();
		
		System.out.print("Digite o número final: ");
		int numeroFinal = entrada.nextInt();
		
		int numeroAtual = numeroInicial;
		
		while (numeroAtual <= numeroFinal) {
			System.out.println(numeroAtual);
			numeroAtual++;
		}
	}
	
}