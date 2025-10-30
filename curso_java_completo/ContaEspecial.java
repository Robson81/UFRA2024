package POO;

public class ContaEspecial extends ContaBancaria {
	
	
	private double limite;

	public ContaEspecial() {
	
	}

	public ContaEspecial(String banco, int agencia, int conta, double saldo, String titular, double limite) {
		super(banco, agencia, conta, saldo, titular);
		System.out.println("Criando Conta Bancária Especial");
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		
		
		return super.toString() + String.format(", Limite:  %.2f", this.limite);
	}
	
	

}
