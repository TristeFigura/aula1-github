package exercicios;
import java.util.Scanner;


public class Matriz {
	
	static int[][] matriz;
	static int[] diag;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with matrix size:");
		int n = scan.nextInt();
		matriz = new int[n][n];
		diag = new int[matriz.length];
		
	
		System.out.println("Enter with the matrix values: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = scan.nextInt();
			}
		}
		
		imprimirMatriz();
		diagonalPrincipal();
		numNegativos();
		System.out.println();
		impNegativos();
	
		
		scan.close();
	}
	
	public static void imprimirMatriz() {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void diagonalPrincipal() {
		System.out.println("Main diagonal: ");
		for (int i = 0; i < matriz.length; i++) {
			diag[i] = matriz[i][i];
			System.out.print(diag[i] + " ");
		}
	}
	
	public static int numNegativos() {
		int negativos = 0;
		for (int i = 0; i < matriz.length; i ++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					negativos++;
				}
			}
		}
		return negativos;
	}
	
	public static void impNegativos() {
		System.out.println("Negative numbers = " + numNegativos());
	}
	

}
