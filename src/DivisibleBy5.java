import java.util.Scanner;
public class DivisibleBy5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println ("Plese type an integer.");
		int response = input.nextInt();
		int counter = 1;
		while (response % 5 != 0 && counter <= 10) {
			System.out.println("Your number is not divisible by 5. Try again.");
			response = input.nextInt();
			counter += 1;
			}
		if (response % 5 == 0)
			System.out.println("Good job. Your number is divisible by 5.");
		else
			System.out.println("You ran out of attempts and didn't find a number divisible by 5.");
		input.close();
	}
}

