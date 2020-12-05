
import java.util.Scanner;
public class Point {

	private int xCoord;
	private int yCoord;
	
	public Point (  ){
		xCoord = 0;
		yCoord = 0;
	}
	
	public Point ( int x, int y){
		xCoord = x;yCoord = y;
	}
	
	public void setXCoord( int m){
		xCoord = m;
	}
	
	public void setYCoord( int n){
		yCoord = n;
	}
	
	public int getXCoord(){
		return xCoord;
	}
	
	public int getYCoord(){
		return yCoord;
	}
	
	public double getDistance ( Point other){
		double XVal = this.getXCoord( ) - other.getXCoord();
		XVal = XVal * XVal;
		double YVal = this.getYCoord() - other.getYCoord();	
		YVal = YVal * YVal;
		double dist = Math.sqrt ( XVal + YVal);
		return dist;
	}
	
	public double getSlope (Point other) {
		double chngY = other.getYCoord() - this.getYCoord();
		double chngX = other.getXCoord() - this.getXCoord();
		double slope = chngY / chngX;
		return slope;
	}
	
	public double getIntercept (Point other) {
		double intercept =  this.getSlope (other) * this.getXCoord() - this.getYCoord();
		return intercept;
	}
	
	public static void main ( String Args[ ]){
		Scanner input = new Scanner (System.in);
		System.out.println ("Please type your X coordinate for Point 1");
		int x1 = input.nextInt();
		System.out.println ("Please type your Y coordinate for Point 1");
		int y1 = input.nextInt();
		System.out.println ("Please type your X coordinate for Point 2");
		int x2 = input.nextInt();
		System.out.println ("Please type your Y coordinate for Point 2");
		int y2 = input.nextInt();
		Point myPoint = new Point (x1, y1);
		Point secPoint = new Point (x2, y2);
		System.out.println ("The distance between the points is " + myPoint.getDistance(secPoint));
		System.out.println ("The line between those points is:");
		System.out.println ("y = " + myPoint.getSlope (secPoint) + " x + " + myPoint.getIntercept (secPoint));
		input.close();
	}
	
}