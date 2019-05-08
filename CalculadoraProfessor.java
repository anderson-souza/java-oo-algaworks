public class CalculadoraProfessor {
	
	public static void main(String[] args) {
		float pi = 3.14f;
		float raio = 5.3f;
		float area = raio * raio * pi;
		boolean apresentarCalculo = false;
		System.out.println("Resultado: " + area);
		
		int areaSemCasasDecimais = (int) area;
		System.out.println("Area sem casas decimais: " + areaSemCasasDecimais);
		
		if(apresentarCalculo) {
			System.out.println("Area = " + raio + " * " + raio + " * " + pi);
		}
		
	}
	
}