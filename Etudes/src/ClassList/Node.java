package ClassList;

public class Node {

	// Classe Node representa um nó da lista encadeada
	int data; // Dado armazenado no nó
	Node next; // Referência para o próximo nó

	// Construtor do nó
	Node(int data) {
		this.data = data;
		this.next = null;
	}

}