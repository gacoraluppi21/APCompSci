import java.util.Scanner;
public class ArraysIntro {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		int[] myList = new int [6];
		int[] funWithNums = new int [20];
		int[] massiveList = new int [100];
		int x = 0;
		
		for (x = 0; x < 6; x++)
			myList [x] = 25;
		
		int total = 0;
		for (x = 0; x < 20; x++)
			{
			funWithNums [x] = input.nextInt();
			if (funWithNums [x] > 50)
				total++;
			}
		System.out.println(total);
		for (x = 1; x < 90; x+=2);
			massiveList [x] = -massiveList [x];	
			
		input.close();		
	}
}
