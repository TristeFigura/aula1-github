package exercicios;

public class Aluno {
	
	private String nome;
	private double[] notas = new double[3];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double soma(double[] notas) {
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		return soma;
	}
	
	public double media() {
		return soma(notas)/notas.length;
	}
	
	public void imprimir() {
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
	
	
	
	

}
