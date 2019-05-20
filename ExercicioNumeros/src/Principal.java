import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe um número: ");
		BigDecimal bg = new BigDecimal(scanner.nextDouble());

		bg = bg.multiply(new BigDecimal(0.1));

		DecimalFormat formatador = new DecimalFormat("R$ ###,##0.00");

		System.out.println("Valor informado: " + formatador.format(bg.doubleValue()));

	}
}
