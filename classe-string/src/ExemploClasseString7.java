
public class ExemploClasseString7 {

	public static void main(String[] args) {
		String s = "Cursos_online_de_desenvolvimento_de_software";
		String x = "12;40.30;12";

		String[] array = s.split("_");
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "] = " + array[i]);
		}
	}

}
