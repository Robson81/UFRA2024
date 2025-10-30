package POO;

public class ContaBancaria {

	private String banco;

	private int agencia, conta;

	private double saldo;

	private String titular;

	public ContaBancaria() {

	}

	public ContaBancaria(String banco, int agencia, int conta, double saldo, String titular) {

		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.titular = titular;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String toString() {

		return "Instituição: " + this.banco + ", Agência: " + this.agencia + ", Conta: " + this.conta + ", Saldo: " + this.saldo + 
				", Titular: " + this.titular;

	}

}
