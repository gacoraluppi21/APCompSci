

public class PosToNeg {

	public static void main(String[] args) {

		int [][] matrix = new int [5][5];
		int counter = 0;
		for (int r = 0; r < 5; r++)
		{
			for (int c = 0; c < 5; c++)
			{
				matrix [r][c] = (int)(Math.random() * 50) - 25;
				System.out.print(matrix [r][c] + " ");
			}	
			System.out.println();
		}
		int compare = matrix [0][0];
		for (int r = 0; r < 5; r++)
		{
			for (int c = 0; c < 5; c++)
			{	
				if (matrix [r][c] < 0 && compare > 0)
						counter++;
				compare = matrix [r][c];
			}
		}
				
		System.out.println("You switched from positive to negative " + counter + " times.");
	}

}
