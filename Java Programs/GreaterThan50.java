import java.util.Scanner;
public class GreaterThan50 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter no more than 5 numbers. Stop when you type one greater than 50.");
		int counter = 1;
		int number = input.nextInt(); 
		while (counter < 5 && number <= 50)
		{
			number = input.nextInt();
			counter++;
		}
		if (number > 50)
			System.out.println("Good job. You selected a number greater than 50");
		else
			System.out.println("You have run out of attempts to select an integer greater than 50");
		
		input.close();
	}
}