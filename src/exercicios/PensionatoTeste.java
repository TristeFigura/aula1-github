package exercicios;
import java.util.Scanner;

public class PensionatoTeste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Pensionato[] pensao = new Pensionato[10];
		
		System.out.println("How many rooms will be rented?");
		int n = scan.nextInt();
		int cont = 0;
		
		while (cont < n) {
			System.out.println("Rent #" + (cont+1) + ":");
			System.out.print("Name: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Email: ");
			String email = scan.nextLine();
			System.out.print("Room: ");
			int numeroQuarto = scan.nextInt();
			System.out.println();
			if (pensao[numeroQuarto] == null) {
				pensao[numeroQuarto] = new Pensionato(nome, email, numeroQuarto);
				cont++;
			}
			else {
				System.out.println("This room is already rented.");
			}
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < pensao.length; i++) {
			if (pensao[i] != null) {
				System.out.println(pensao[i].getNumeroQuarto() + ": " + pensao[i].getNome() + ", " + pensao[i].getEmail());
			}
		}
		scan.close();
		
	}

}
