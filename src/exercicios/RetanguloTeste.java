package exercicios;
import java.util.Scanner;

public class RetanguloTeste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		entrada(retangulo, scan);
		retangulo.area();
		retangulo.perimeter();
		retangulo.diagonal();
		System.out.println(retangulo);
		
		Retangulo retangulo2 = new Retangulo();
		entrada(retangulo2, scan);
		retangulo2.perimeter();
		retangulo2.diagonal();
		System.out.println(retangulo2);

	}
	
	public static void entrada(Retangulo dados, Scanner scan) {
		double width;
		double height;
		do {
			System.out.println("Enter rectangle width: ");
			width = scan.nextDouble();
			dados.setWidth(width);
			if (width < 0) {
				System.out.println("Width can't be a negative value. Try again.");
			}
		}
		while (width < 0);
		
		do {
			System.out.println("Enter rectangle height: ");
			height = scan.nextDouble();
			dados.setHeight(height);
			if (height < 0) {
				System.out.println("Height can't be a negative value. Try again.");
			}
		}
		while (height < 0);
	}

}
