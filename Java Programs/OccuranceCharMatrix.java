
public class OccuranceCharMatrix {

	public static void main(String[] args) {
		char matrix [][] = new char [3][4];
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				matrix [i][j] = (char)((int)((Math.random() * 26) + 97));
				System.out.print(matrix [i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
