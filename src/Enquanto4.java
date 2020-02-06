import java.util.Scanner;

public class Enquanto4 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int alcool = 0;
			int gasolina = 0;
			int diesel = 0;
			int opcao = 0;
		
			
			while (opcao != 4) {
				System.out.println("1.Ácool 2.Gasolina 3.Diesel 4.Fim");
				opcao = scan.nextInt();
				switch (opcao) {
				case 1:
					alcool++;
					break;
				case 2:
					gasolina++;
					break;
				case 3:
					diesel++;
					break;
				case 4:
					break;
				default: System.out.println("Entrada inválida.");
					break;
				}
			}
			
			System.out.println("MUITO OBRIGADO");
			System.out.printf(" Alcool: %s%n Gasolina: %s%n Diesel: %s%n", alcool, gasolina, diesel);
			
		}

}
