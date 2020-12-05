import java.util.Scanner;
public class Node {

	private int data;
	private Node next;
	
	public Node () {
		data = 0;
		next = null;
	}
	
	public Node (int p, Node q) {
		data = p;
		next = q;
	}
	//constructors
	
	public void setData (int x) {
		data = x;
	}
	
	public void setNext (Node x) {
		next = x;
	}
	//mutators
	
	public int getData () {
		return data;
	}
	
	public Node getNext () {
		return next;
	}
	//accessor
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please type in an integer.");
		int a = input.nextInt();
		System.out.println("Please type in another integer.");
		int b = input.nextInt();
		Node second = new Node ();
		second.setData(b);
		Node first = new Node (a, second);
		System.out.println( first.getData() + " " +  first.getNext().getData() );
		
		input.close();
	}

}
