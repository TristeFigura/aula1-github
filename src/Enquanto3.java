import java.util.Scanner;
public class Enquanto3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = 1;
		int y = 1;
		
		while (x != 0 && y != 0) {
			System.out.println("Entre com a abcissa: ");
			x = scan.nextInt();
			System.out.println("Entre com a ordenada: ");
			y = scan.nextInt();
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Quarto quadrante");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
			}
		}

	}

}
