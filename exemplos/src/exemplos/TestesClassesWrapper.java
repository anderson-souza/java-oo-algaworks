package exemplos;

public class TestesClassesWrapper {

	public static void main(String[] args) {
		// byte, short, int, long, float, double e char
		// Byte, Short, Integer, Long, Float, Double e Character

		int x = 5;
		Integer i = new Integer(10);
		
		byte y = i.byteValue();
		
		String valor = "15.5";
		Float v = new Float(valor);
		System.out.println(v + 3);
		
		int idade = Integer.parseInt("27");
		System.out.println("Daqui a 5 anos você terá: " + (idade + 5) + " anos");
		
		Byte.parseByte("10");
		try {
			double custo = Double.parseDouble(null);
		} catch (NumberFormatException e) {
			System.err.println("Número inválido para correção");
		} catch (NullPointerException e) {
			System.err.println("Número nulo");
		}
		
		//System.out.println("Custo total: " + custo);
	}

}
