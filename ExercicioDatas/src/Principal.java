import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String args[]) {
		new Principal();
	}

	public Principal() {
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Data do �ltimo per�odo menstrual (dd/mm/aaaa):");
			String ultimoPeriodoMenstrual = entrada.nextLine();

			Date dataUltimoPeriodoMenstrual = this.converterEmData(ultimoPeriodoMenstrual);
			CalculadoraGravidez calculadora = new CalculadoraGravidez(dataUltimoPeriodoMenstrual);

			Date dataEstimadaConcepcao = calculadora.calcularDataEstimadaConcepcao();
			System.out.println("Data estimada da concep��o: " + this.formatarData(dataEstimadaConcepcao));

			Date dataEstimadaParto = calculadora.calcularDataEstimadaParto();
			System.out.println("Data estimada para parto: " + this.formatarData(dataEstimadaParto));
		} catch (ParseException pe) {
			System.out.println("Informe uma data no padr�o dd/mm/aaaa.");
		}
	}

	private String formatarData(Date data) {
		// Padr�o de formata��o de data por extenso
		// A classe Locale representa uma regi�o no planeta, sendo neste caso
		// o Brasil (br), onde falamos Portugu�s (pt)
		// O Locale � usado aqui para formatar a data em portugu�s brasileiro
		DateFormat formatador = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy", new Locale("pt", "br"));
		return formatador.format(data);
	}

	private Date converterEmData(String texto) throws ParseException {
		// implementar convers�o de texto para data no formato dd/MM/yyyy
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = new Date();
		try {
			dataFormatada = formatador.parse(texto);
		} catch (ParseException e) {
			System.out.println("Erro na formata��o: " + e.getMessage());
		}
		return dataFormatada;

	}

}