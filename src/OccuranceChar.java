
public class OccuranceChar {

	public static void main(String[] args) {
		
		char grid [] = new char [100];
		int occurance = 1;
		int counter = 1;
		for (int i = 0; i < 100; i++)
		{
			grid [i] = (char)((int)((Math.random() * 26) + 97));
			System.out.println(grid [i]);
		}
		
		for (int i = 1; i < 100; i++)
		{
			if (grid [i] == grid [i - 1])
				counter++;	
			else if (counter > occurance)
				occurance = counter;
			else
				counter = 1;
		}
		System.out.println("The longest occurance is " + occurance);
	}

}
