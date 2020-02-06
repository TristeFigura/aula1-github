import java.util.Scanner;

public class Enquanto2 {

	public static void main(String[] args) {

		int senha = 2002;
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		while (num != 2002) {
			System.out.println("Senha inválida");
			num = scan.nextInt();
		}
		
		System.out.println("Acesso permitido");
		

	}

}
