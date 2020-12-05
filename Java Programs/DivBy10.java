
import java.util.Scanner;
public class DivBy10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int [] longList = new int [20];
		int x = 0;
		int total = 0;
		for (x = 0; x < 20; x++)
			longList [x] =  input.nextInt();
		for (x = 0; x < 20; x++)	
			if (longList [x] % 10 == 0 && longList [x] != 0)
				total++;
		System.out.println(total + " numbers are divisible by 10");
		input.close();
	}
}
