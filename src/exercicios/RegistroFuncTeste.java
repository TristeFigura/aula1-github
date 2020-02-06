package exercicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RegistroFuncTeste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many employees will be registered?");
		int n = scan.nextInt();
		
		RegistroFunc emp = new RegistroFunc();
		List <RegistroFunc> func = new ArrayList<>();
		int contador = 0;
		
		while (contador < n) {
			System.out.println("Employee #" + (contador+1) + ":");
			System.out.print("Id: ");
			int id = scan.nextInt();
			System.out.print("Name: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Salary: ");
			double salario = scan.nextDouble();
			func.add(new RegistroFunc(id, nome, salario));
			System.out.println();
			contador++;
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = scan.nextInt();
		emp = func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp != null) {
			System.out.println("Enter the percentage: ");
			double porcentagem = scan.nextDouble();
			emp.aumentarSalario(porcentagem);
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (RegistroFunc x : func) {
			System.out.println(x);
		}

	}

}
