package exercicios;
import java.util.Scanner;

public class ExerMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int up, down, left, right;
		
		System.out.println("Enter with the line size: ");
		int linha = scan.nextInt();
		System.out.println("Enter with the column size: ");
		int coluna = scan.nextInt();
		
		int[][] matrix = new int[linha][coluna];
		
		System.out.println("Enter with matrix elements: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Enter with element for find: ");
		int proc = scan.nextInt();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (proc == matrix[i][j]) {
					System.out.println("Position " + i + "," + j + ": ");
					if (i-1 >= 0) {
						System.out.println("Up: " + (up = matrix[i-1][j]));
					}
					if (i+1 < matrix.length) {
						System.out.println("Down: " + (down = matrix[i+1][j]));
					}
					if (j-1 >= 0) {
						System.out.println("Left: " + (left = matrix[i][j-1]));
					}
					if (j+1 < matrix[i].length) {
						System.out.println("Right: " + (right = matrix[i][j+1]));
					}
					
				}
			}
		}

	}

}
