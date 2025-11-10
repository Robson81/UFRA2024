package ufra.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ufra.entities.PedidoPizza;
import ufra.entities.enums.PizzaSabor;
import ufra.entities.enums.PizzaTamanho;

public class MainPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int aux = 0;
		char aux1;
		
		//PedidoPizza pedido = new PedidoPizza(PizzaTamanho.FAMILIA, PizzaSabor.CALABRESA, PizzaSabor.MUSSARELA, new Date(), 1);
		
		List<PedidoPizza> pedido = new ArrayList<>();		
				
		System.out.println("\t\t\tUFRA PIZZA");
		System.out.println("\t\t\t Cardápio");
		System.out.println("\tSabores");
		System.out.println(PizzaSabor.CALABRESA +  "  \t\tCódigo: 1");
		System.out.println(PizzaSabor.MUSSARELA +  "  \t\tCódigo: 2");
		System.out.println(PizzaSabor.MISTA   + "\t   \t\tCódigo: 3");

		
		System.out.println("\tTamanho " + "Preço" );
		System.out.println(PizzaTamanho.FAMILIA + "\t\tR$ 60" +   "\tCódigo: F");
		System.out.println(PizzaTamanho.MEDIA   + "\t\tR$ 50" +   "\tCódigo: M");
		System.out.println(PizzaTamanho.PEQUENA + "\t\tR$ 40" +   "\tCódigo: P");
		System.out.println(PizzaTamanho.INDIVIDUAL + "\tR$ 30" +  "\tCódigo: I");
		
		
		System.out.println("Faça seu Pedido:");		
		do {
			System.out.print("Informe o código do sabor, conforme tabela acima: ");
			int codSabor = sc.nextInt(); 
			
			String sabor = (codSabor == 1)? "CALABRESA":(codSabor == 2)? "MUSSARELA":(codSabor == 3)? "MISTA":"";	
			System.out.print("Informe o código do tamanho, conforme tabela acima: ");
			char codTamanho = sc.next().charAt(0);
			System.out.print("Informe a quantidade de Pizzas do tipo escolhido: ");
			int qtd = sc.nextInt();
			Date data = new Date();
			
			pedido.add(new PedidoPizza(PizzaTamanho.FAMILIA, PizzaSabor.valueOf(sabor), data, qtd));
			
			System.out.println("Dados do seu pedido: ");
			System.out.println("Data e hora: " + pedido.get(aux).getMoment());
			System.out.println("Pizza tamanho: " + pedido.get(aux).getTamanho() + ", Sabor: " + pedido.get(aux).getSabor());
			System.out.println("Quantidade: " + pedido.get(aux).getQuantidade());
			System.out.println("Valor parcial: " + pedido.get(aux).Preco(pedido.get(aux).getTamanho(), qtd));
			System.out.println("**********************************************************");
			System.out.print("Deseja incluir um novo sabor ao seu pedido? (S / sim ou N/não: ");
			aux1 = sc.next().charAt(0);
			
			aux++;
			
		}while(aux1 == 'S'||aux1=='s' );
		
		

		sc.close();
	}

}
