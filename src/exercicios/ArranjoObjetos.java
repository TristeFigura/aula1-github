package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class ArranjoObjetos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		Objetos[] vect = new Objetos[n];
		
		for (int i = 0; i < vect.length; i++) {
			scan.nextLine();
			String name = scan.nextLine();
			double price = scan.nextDouble();
			vect[i] = new Objetos(name, price);
		}
		
		double sum = 0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		
		

		
		scan.close();
	}

}
