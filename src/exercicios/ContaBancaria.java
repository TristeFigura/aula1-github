package exercicios;

public class ContaBancaria {
	
	private String numConta;
	private String nome;
	private double saldo;
	
	
	public ContaBancaria(String numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}
	
	public ContaBancaria(String numConta, String nome, double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		depositar(depositoInicial);
	}

	public String getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}


	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	} 
	
	public void sacar(double valorSaque) {
		double valorTaxaDeposito = 5;
		saldo -= (valorSaque + valorTaxaDeposito);
	}
	
	@Override
	public String toString() {
		return 
			   "Account " + numConta + ", Holder: " +
				nome + ", Balance: $ " + String.format("%.2f", saldo);
	}
	
	
	

}
