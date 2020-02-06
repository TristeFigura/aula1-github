import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		double x = 10.35784;
		double y = 2;
		System.out.printf("%.2f\n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", x);
		
		System.out.printf("Resultado = %f + %s", x, y);
		
	}

}
