
import java.util.Scanner;
public class CharOccurance {

	public static void main(String[] args) {
	
		System.out.println("Please type a String.");
		Scanner input = new Scanner(System.in);
		String word = new String ();
		word = input.nextLine();
		char [] parsing = new char [word.length()];
		int occurance = 0;
		int total = 0;
		char c = ' ';
		parsing [0] = word.charAt(0);
		for (int i = 1; i < parsing.length; i++)
		{
			parsing [i] = word.charAt(i);
			if (parsing [i] == parsing [i - 1])
			{
				occurance++;
				if (occurance > total)
				{
					total = occurance;
					c = parsing [i - 1];
				}
			}
			else
				occurance = 1;		
		}
		if (c != ' ')
			System.out.println("The character '" + c + "' appered " + total + " times in a row.");
		else
			System.out.println("There were no repeated characters.");
		input.close();
	}

}
