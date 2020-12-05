
import java.util.Scanner;
public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle () {
		width = 0;
		length = 0;
	}
	
	public Rectangle (double len, double wid) {
		width = wid;
		length = len;
	}
	
	void setWidth (double recWidth) {
		width = recWidth;
	}
	
	double getWidth ( ) {	
		return width;
	}
	
	void setLength (double recLength) {
		length = recLength;
	}
	
	double getLength ( ) {
		return length;
	}
	
	public double findArea () {
		double area = length * width;
		return area;	
	}
	
	boolean isSquare () {
		if (length == width)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please type the width and length in order.");
		Rectangle rec1 = new Rectangle(input.nextDouble() , input.nextDouble());
		System.out.println("It is " + rec1.isSquare() + " that your rectangle is a square.");
		System.out.println("The area of your rectangle is " + rec1.findArea());
		input.close();
	}
}
