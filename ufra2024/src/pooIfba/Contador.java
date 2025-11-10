package pooIfba;

public class Contador {

	private int count = 0;

	public Contador() {
		System.out.println("Criando um contador:" + this.count);
	}

	public int getCount() {
		System.out.print("Imprimindo o contador: ");

		return  count;
	}

	public void zerar() {
		System.out.println("Zerando o contador:");

		this.count = 0;
	}

	public void incrementar(int num) {
		System.out.println("Incrementando o contador: " + num + " vezes:");

		int aux = 0;
		if (num > 0) {
			for (int i = 0; i < num; i++) {

				aux++;
			}
			this.count += aux;
		}
	}
	
}
