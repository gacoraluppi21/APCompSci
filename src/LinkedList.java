
public class LinkedList {

	private Node head;
	public LinkedList() {
		head = null;
	}
	public LinkedList(Node given) {
		head = given;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void print () {
		Node snaker = head;
		while (snaker != null) {
			System.out.println(snaker.getData());
			snaker = snaker.getNext();
		}	
		System.out.println();
	}
	public void insertAtFront (Node N) {
		N.setNext(head);
		head = N;
	}
	public void insertAtEnd (Node N) {
		Node snaker = head;
		while (snaker.getNext() != null) 
			snaker = snaker.getNext();
		snaker.setNext(N);	
	}
	public void removeHead () {
		head = head.getNext();
	}
	public void removeEnd () {
		Node trailer = head;
		Node snaker = trailer.getNext();
		while (snaker.getNext() != null) {
			trailer = snaker;
			snaker = snaker.getNext();
		}
		trailer.setNext(null);
	}
	public int countNodes () {
		int counter = 0;
		Node snaker = head;
		while (snaker.getNext() != null) {
			counter++;
			snaker = snaker.getNext();
		}
		return counter;	
	}
	public void removeNode (Node P) {
		
	}
	public void insertInOrder () {
		
	}
	
	public static void main(String[] args) {
		

	}

}
