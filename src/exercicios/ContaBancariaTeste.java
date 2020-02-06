package exercicios;
import java.util.Scanner;

public class ContaBancariaTeste {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ContaBancaria conta1;
		
		System.out.print("Enter account number: ");
		String numConta = scan.nextLine();
		System.out.print("Enter account holder: ");
		String nome = scan.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = scan.next().charAt(0);
		
	
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = scan.nextDouble();
			conta1 = new ContaBancaria(numConta, nome, depositoInicial);
		}
		else {
			conta1 = new ContaBancaria(numConta, nome);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta1);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valorDeposito = scan.nextDouble();
		conta1.depositar(valorDeposito);
		System.out.println("Updated account data:");
		System.out.println(conta1);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double valorSaque = scan.nextDouble();
		conta1.sacar(valorSaque);
		System.out.println("Updated account data:");
		System.out.println(conta1);
		
		scan.close();
	}

}
