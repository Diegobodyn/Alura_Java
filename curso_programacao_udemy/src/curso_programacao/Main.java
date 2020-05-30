package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	
		int y = 32;
		double x = 10.32784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f",x);

	}

}
