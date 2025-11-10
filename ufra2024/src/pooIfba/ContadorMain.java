package pooIfba;

public class ContadorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contador c1 = new Contador();

		System.out.println(c1.getCount());
		c1.incrementar(3);
		System.out.println(c1.getCount());
		c1.incrementar(2);
		System.out.println(c1.getCount());
		c1.zerar();
		System.out.println(c1.getCount());
		c1.incrementar(2);
		System.out.println(c1.getCount());

	}

}
