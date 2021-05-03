package hackerrank30Dayschallenge.LinkeList;

public class LinkedListUS {

	// Properties
	Node head;
	int count;

	// constructor
//	public LinkedList() {
//		// TODO Auto-generated constructor stub
//		head = null;
//		count = 0;
//	}

	public LinkedListUS(Node head) {
		this.head = head;
		count = 1;
	}

	// methods

	// add
	public void add(int newData) {
		Node temp = new Node(newData);
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}

	// get
	public int get(int index) {

		if (index <= 0) {
			return -1;
		}
		Node current = head;
		for (int i = 1; i < index; i++) {
			current = current.getNext();
		}
		return current.getData();

	}

	// size
	public int size() {
		return count;
	}

	// isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	
	
	// remove
	public void remove() {
		
		Node current = head;
		
	}

	public static void main(String[] args) {
		
		

	}

}
