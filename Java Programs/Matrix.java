
public class Matrix {

	public static void main(String[] args) {
		int [] [] matrix = new int [5] [5];
		int counter = 0;
		for (int i = 0 ; i < 5; i++)
			{
			for (int j = 0; j < 5; j++)
				{
				int x = (int) (Math.random() * 100);
				matrix [i] [j] = x;
				if (matrix [i] [j] % 3 == 0 && matrix [i] [j] != 0)
					counter++;
				System.out.print (matrix [i] [j] + "  ");
				}		
			System.out.println();
			}
		System.out.println("There are " + counter + " numbers divisible by 3.");
	}

}
