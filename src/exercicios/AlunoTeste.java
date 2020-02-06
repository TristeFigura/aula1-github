package exercicios;
import java.util.Scanner;

public class AlunoTeste {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		
		System.out.println("Entre com o nome do aluno: ");
		String nome = scan.nextLine();
		aluno1.setNome(nome);
		
		dataInput(aluno1, scan);
		aluno1.soma(aluno1.getNotas());
		aluno1.media();
		output(aluno1);
		qualif(aluno1);
		
		
		
		
	}
	
	public static void dataInput(Aluno data, Scanner scan) {
		for (int i = 0; i < data.getNotas().length; i++) {
			System.out.println("Entre com a " + (i+1) + "º nota do trimestre.");
			data.getNotas()[i] = scan.nextDouble();
		}
	}
	
	public static void qualif(Aluno data) {
		if (data.soma(data.getNotas()) > 60) {
			System.out.println("PASS");
		}
		else {
			double dif = 60 - data.soma(data.getNotas());
			System.out.println("FAILED");
			System.out.println("MISSING " + dif + " POINTS");
		}
	}
	
	public static void output(Aluno data) {
		System.out.println("FINAL GRADE = " + data.soma(data.getNotas()));
	}
	

	

}
