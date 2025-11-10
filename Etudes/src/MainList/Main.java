package MainList;

import ClassList.LinkedList;

public class Main {

	// Classe principal para testar a lista encadeada
	public class LinkedListTest {
		public static void main(String[] args) {

			LinkedList list = new LinkedList();

			// Inserção de elementos
			list.insertAtEnd(10);
			list.insertAtEnd(20);
			list.insertAtEnd(30);
			list.insertAtEnd(40);
			list.insertAtEnd(50);

			// Imprime a lista do início ao fim
			System.out.println("Lista do início ao fim:");
			list.printListForward();

			// Imprime a lista do fim ao início
			System.out.println("Lista do fim ao início:");
			list.printListBackward();

			// Inserção no início
			list.insertAtBeginning(5);
			System.out.println("Após inserção no início:");
			list.printListForward();

			// Inserção em uma posição específica
			list.insertAtPosition(25, 3);
			System.out.println("Após inserção na posição 3:");
			list.printListForward();

			// Remoção de um elemento
			list.remove(30);
			System.out.println("Após remoção do elemento 30:");
			list.printListForward();

			// Pesquisa de um elemento
			System.out.println("Pesquisa do elemento 25: " + list.search(25));
			System.out.println("Pesquisa do elemento 30: " + list.search(30));

			// Esvaziamento da lista
			list.clear();
			System.out.println("Após esvaziamento:");
			list.printListForward();
		}
	}

}
