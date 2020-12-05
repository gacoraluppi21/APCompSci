
import java.util.Scanner;
public class testBoolean {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("You have 3 attempts to select an odd number. I will stop you if you do.");
		int counter = 1;
		int number = input.nextInt();
		while (number % 2 == 0 && counter < 3) 
		{
			System.out.println("Please type another integer.");
			number = input.nextInt();
			counter++;
		}
		if (number % 2 != 0)
			System.out.println("You selected an odd number.");
		else
			System.out.println("You have reached the maximum 3 attempts. No numbers that you selected were odd.");
		input.close();
	}
}
