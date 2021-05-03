package hackerrank30Dayschallenge.LinkeList;

public class Node {

	Node next;
	int data;
	
	
	public Node(int data) {
		this.data = data;
		next = null;
	}
	
	public Node(Node next, int data) {
		this.next = next;
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	
	
}
