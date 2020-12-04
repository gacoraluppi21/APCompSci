import java.util.Scanner;
public class DivisibleBy10OrGreaterThan100 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Type integers.");
		int number = input.nextInt();
		while (number % 10 != 0 && number <= 100) {
			System.out.println("That number isin't greater than 100 nor is it divisible by 10. Try again.");
			number = input.nextInt();
		}
		if (number % 10 == 0 && number <= 100)
			System.out.println("Good job. You left the loop because your number is divisible by 10.");
		else if (number >= 100 && number % 10 != 0)
			System.out.println("Good job. You left the loop because your number is greater than 100.");
		else
			System.out.println("Good job. You left the loop because your number is greater than 100 and divisible by 10.");
		input.close();
	}

}
