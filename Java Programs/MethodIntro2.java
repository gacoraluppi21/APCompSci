
import java.util.Scanner;
public class MethodIntro2 {

	public static int getOccurance (char [][] myGrid, char letter) {
		int total = 0;
		for (int r = 0; r < 4; r++)
		{
			for (int c = 0; c < 4; c++)
				if (myGrid [r][c] == letter)
				total++;
		}
		return total;
	}//closes getOccurance method
	
	public static char [][] toCaps (char [][] capsArray) {
		for (int r = 0; r < 4; r++)
		{
			for (int c = 0; c < 4; c++)
				capsArray [r][c] = (char)(((int)capsArray [r][c]) - 32);
		}
		return capsArray;
	}//closes toCaps method
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please type a character.");
		char myChar = input.next().charAt(0);
		char [][] myMatrix = new char [4][4];
		for (int r = 0; r < 4; r++)
		{
			for (int c = 0; c < 4; c++)
			{
				myMatrix [r][c] = (char)((int)(Math.random() * 26 + 97));
				System.out.print(myMatrix [r][c] + " ");
			}
			System.out.println();
		}
		int occurance = getOccurance(myMatrix, myChar);
		System.out.println();
		System.out.println("The character " + myChar + " appeared " + occurance + " times in the matrix.");
		myMatrix = toCaps(myMatrix);
		System.out.println();
		System.out.println("The same array in capitals is the following:");
		for (int r = 0; r < 4; r++)
			{
			for (int c = 0; c < 4; c++)
				System.out.print(myMatrix [r][c] + " ");
			System.out.println();
			}
		input.close();
	}//closes main method

}//closes class
