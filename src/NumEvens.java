import java.util.Scanner;
public class NumEvens {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Plese type up to 10 integers. I will stop you when you have typed three even numbers.");
		int totalEvens = 0;
		int counter = 1;
		while (totalEvens < 3 && counter <10)
		{
			int response = input.nextInt();
			if (response % 2 == 0)
				totalEvens++;
			counter++;
		}
		if (totalEvens == 3)
			System.out.println("You have reached three even numbers. Good job.");
		else
			System.out.println("Sorry, you have reached your maximum attempts and did not reach 3 even numbers.");
		
		input.close();
	}
}
