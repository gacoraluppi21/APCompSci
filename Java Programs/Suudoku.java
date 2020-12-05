

public class Suudoku {

	public static int [][] createSuudoku (){
		int [][] suudoku = { {8, 2, 7, 1, 5, 4, 3, 9, 6}, {9, 6, 5, 3, 2, 7, 1, 4, 8}, {3, 4, 1, 6, 8, 9, 7, 5, 2}, {5, 9, 3, 4, 6, 8, 2, 7, 1}, {4, 7, 2, 5, 1, 3, 6, 8, 9}, {6, 1, 8, 9, 7, 2, 4, 3, 5}, {7, 8, 6, 2, 3, 5, 9, 1, 4}, {1, 5, 4, 7, 9, 6, 8, 2, 3}, {2, 3, 9, 8, 4, 1, 5, 6, 7} };
		return suudoku;
	}
	
	public static boolean checkRows (int [][] suudoku) {
		for (int r = 0; r < suudoku.length; r++) {
			int total = 0;
			for (int c = 0; c < suudoku[0].length; c++) 
				total += suudoku [r][c];
			if (total != 45)
				return false;
		}	
		return true;
	}
	
	public static boolean checkCols (int [][] suudoku) {
		for (int c = 0; c < suudoku[0].length; c++) {
			int total = 0;
			for (int r = 0; r < suudoku.length; r++)  
				total += suudoku [r][c];
			if (total != 45)
				return false;
		}	
		return true;
	}

	public static boolean checkSqr (int [][] suudoku) {
		int total = 0;
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				for (int r = row * 3; r < (row + 1) * 3; r++) {
					for (int c = col * 3; c < (col + 1) * 3; c++) 
						total += suudoku[r][c];
				}
				if (total != 45)
					return false;
				total = 0;
			}
		}	
		return true;
	}
	
	public static void main(String[] args) {
		boolean flag = true;
		int [][] suudoku = createSuudoku();
		if (checkRows(suudoku) == false)
			flag = false;
		if (checkCols(suudoku) == false)
			flag = false;
		if (checkSqr(suudoku) == false)
			flag = false;
		if (flag == true)
			System.out.println("Your suudoku solution works.");
		else 
			System.out.println("Your suudoku solution does not work.");
		
	}

}
