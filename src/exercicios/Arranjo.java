package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Arranjo {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = scan.nextInt();
		double[] vect = new double[n];
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			vect[i] = scan.nextDouble();
			soma += vect[i];
		}
		
		double media = soma/vect.length;
		
		System.out.println("Média das alturas: " + media);
		scan.close();
	}

}
