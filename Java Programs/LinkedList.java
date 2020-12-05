
public class LinkedList {
	
	private Node head;
	
	public LinkedList () {
		head = null;
	}
	public LinkedList (Node given) {
		head = given;
	}
	//constructors
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
	public void addNodeEnd (Node N) {
		Node snaker = head;
		while (snaker.getNext() != null) 
			snaker = snaker.getNext();
		snaker.setNext(N);
	}
	public void removeHead () {
		head = head.getNext();
	}
	public void removeEnd () {
		Node follower = head;
		Node snaker = follower.getNext();
		while (snaker.getNext() != null) {
			snaker = snaker.getNext();	
			follower = follower.getNext(); }
		follower.setNext(null);
	}
	public int countNodes () {
		int counter = 0;
		Node snaker = head;
		while (snaker != null) {
			snaker = snaker.getNext();
			counter++;
		}
		return counter;
	}
	public void removeNode(Node P) {
		Node snaker = head;
		while (snaker.getNext() != P) 
			snaker = snaker.getNext();
		snaker.setNext(P.getNext());	
	}
	public void insertInOrder (Node M) {
		Node follower = head;
		Node snaker = follower.getNext();
		while (snaker.getData() < M.getData()) {
			snaker = snaker.getNext();
			follower = follower.getNext();}
		M.setNext(snaker);
		follower.setNext(M);
	}
	
	public static void main(String[] args) {
		Node fifth = new Node (32, null);
		Node fourth = new Node (16, fifth);
		Node third = new Node (8, fourth);
		Node second = new Node (4, third);
		Node first = new Node (2, second);
		LinkedList myList = new LinkedList (first);
		myList.print();
		Node front = new Node (1, null);
		myList.insertAtFront(front);
		Node end = new Node (64, null);
		myList.addNodeEnd(end);
		myList.print();
		myList.removeHead();
		myList.removeEnd();
		myList.print();
		int count = myList.countNodes();
		System.out.println(count);
		System.out.println();
		myList.removeNode(third);
		myList.print();
		myList.insertInOrder(third);
		myList.print();
	}	
}