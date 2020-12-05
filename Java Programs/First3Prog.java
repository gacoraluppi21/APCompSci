
import java.util.Scanner;
public class First3Prog {

	public static void main2(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Select three numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		double average = (a + b + c) / 3.0;
		System.out.println("The average of those numbers is " + average);
		input.close();
		
	}

	public static void main(String[] args) {
		Scanner input2 = new Scanner (System.in);
		System.out.println("What is the temperature in farenheit?");
		int farenheit = input2.nextInt();
		double celsius = (farenheit-32)*5.0/9.0;
		System.out.println("That is equal to " + celsius + " degrees celsius");
		input2.close();
		
	}

	public static void main3(String[] args) {
		Scanner input3 = new Scanner (System.in);
		System.out.println("How far did you run in miles?");
		double miles = input3.nextDouble();
		double kilometers = (miles*1.60934);
		System.out.println("That is equal to " + kilometers + " kilometers");
		input3.close();
	
	}
}