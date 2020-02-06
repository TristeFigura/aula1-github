package exercicios;
import java.util.Scanner;

public class EmployeeTeste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		Employee sancho = new Employee();
		dataInput(sancho, scan);
		System.out.println(sancho);
		System.out.print("Which percentage to increase salary?");
		double percentage = scan.nextDouble();
		sancho.increaseSalary(percentage);
		System.out.println(sancho);
		
		
		
		
	}
	
	static void dataInput(Employee data, Scanner scan) {
		System.out.print("Name: ");
		String nome = scan.nextLine();
		data.setName(nome);
		System.out.print("Gross salary: ");
		double grossSalary = scan.nextDouble();
		data.setGrossSalary(grossSalary);
		System.out.print("Tax: ");
		double tax = scan.nextDouble();
		data.setTax(tax);
	}

}
