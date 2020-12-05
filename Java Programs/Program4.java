
import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Select three integers.");
		int integerOne = input.nextInt();
		int integerTwo = input.nextInt();
		int integerThree = input.nextInt();
		
		if (integerOne == 0) // I have added these lines because otherwise 0 would count as even
			a = 0;
		else if (integerOne % 2 == 0) 
			a = 1;
		if (integerTwo == 0)
			b = 0;
		else if (integerTwo % 2 == 0)
			b = 1;
		if (integerThree == 0)
			c = 0;
		else if (integerThree % 2 == 0)
			c = 1;
		
		int amount = a + b + c;
		
		if (amount == 1 )
			System.out.println("You have selected " + amount + " even number" );
		else
			System.out.println ("You have selected " + amount + " even numbers");
		input.close();	
	}
}