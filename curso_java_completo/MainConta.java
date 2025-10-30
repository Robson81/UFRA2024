package POO;

public class MainConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        ContaBancaria c1 = new ContaBancaria("Banco UFRA", 0001, 1002, 0.0, "Aluno BSI UFRA 02");
		System.out.println();
		ContaBancaria c2 = new ContaEspecial("Banco UFRA", 0001, 1001, 0.0, "Aluno BSI UFRA 01", 200.0);
		System.out.println();		
		
		System.out.println("Dados Bancários do 1º Cliente: \n\n" + c1);
		System.out.println("\n******************************\n");
		System.out.println("Dados Bancários do 2º Cliente: \n\n" + c2);

	
	
	
	
	
	
	
	
	
	}

}
