
import java.util.Scanner;
public class Lowercase {

	public static void main(String[] args) {
		System.out.println("Please type a string");
		Scanner input = new Scanner (System.in);
		String userString = input.nextLine();
		input.close();
		char [] myString = new char [userString.length()];
		int x = 0;
		for (x = 0; x < myString.length; x++)
			{
			myString [x] = userString.charAt(x);	
			System.out.println( myString [x]);
			}
	}
}
