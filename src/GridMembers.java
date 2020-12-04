
public class GridMembers {

	public static void main(String[] args) {
		
		int [] [] grid = new int [3][4];
		int total = 0;
		int evens = 0;
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				grid [i][j] = (int) (Math.random() * 50);
				total += grid [i][j];
				if (grid [i][j] % 2 == 0 && grid [i][j] != 0)
					evens++;
				System.out.print(grid [i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("Your total is " + total + ".");
		System.out.println("There are " + evens + " even numbers.");
	
	}

}
