import java.util.Scanner;

public class TesteDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int divisor = entrada.nextInt();

		for (int i = 100; i <= 120; i++) {
			if (i % divisor == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Fim do programa");
	}
}
