package ClassList;

public class LinkedList {

	private Node head; // Referência para o início da lista

	// Construtor da lista
	public LinkedList() {
		this.head = null;
	}

	// Inserção no início da lista
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// Inserção no final da lista
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// Inserção em qualquer posição (pelo índice, 0 baseado)
	public void insertAtPosition(int data, int position) {
		if (position < 0) {
			System.out.println("Posição inválida.");
			return;
		}
		if (position == 0) {
			insertAtBeginning(data);
			return;
		}

		Node newNode = new Node(data);
		Node temp = head;
		for (int i = 1; i < position && temp != null; i++) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Posição fora do alcance.");
			return;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	// Remoção de um elemento
	public void remove(int data) {
		if (head == null)
			return;

		if (head.data == data) {
			head = head.next;
			return;
		}

		Node temp = head;
		while (temp.next != null && temp.next.data != data) {
			temp = temp.next;
		}

		if (temp.next == null) {
			System.out.println("Elemento não encontrado.");
			return;
		}

		temp.next = temp.next.next;
	}

	// Pesquisa de um elemento
	public boolean search(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == data)
				return true;
			temp = temp.next;
		}
		return false;
	}

	// Consulta do início ao fim da lista
	public void printListForward() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// Consulta do fim ao início da lista (usa recursão)
	public void printListBackward(Node node) {
		if (node == null)
			return;
		printListBackward(node.next);
		System.out.print(node.data + " ");
	}

	public void printListBackward() {
		printListBackward(head);
		System.out.println();
	}

	// Esvaziamento da lista
	public void clear() {
		head = null;
	}

	// Verifica se a lista está vazia
	public boolean isEmpty() {
		return head == null;
	}

	// Retorna o tamanho da lista
	public int size() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

}
