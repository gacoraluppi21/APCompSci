
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Type an integer from 0 to 2147483647. I will give you the sum of the digits.");
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		
		while (number != 0) {
		sum += (number % 10);
		number = number / 10;
		}
		 
		System.out.println("The sum of your digits is " + sum);
		input.close();
	}
}
