import java.util.Scanner;
public class Enquanto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		int num = 1;	
		
		while (num != 0) {
			System.out.println("Entre com um número: ");
			num = scan.nextInt();
			soma += num;
			
		}
		System.out.println(soma);

	}

}
