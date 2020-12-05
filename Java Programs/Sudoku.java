
public class Sudoku {
	
	public static int [][] loadSudoku() {
	int [][] sudoku = new int [9][9];
	//copy sudoku here
		return sudoku;
	}

	public static boolean  checkRow (int [] row) {
		boolean flag = true;
		int rowTotal = 0;
		for (int x = 0; x < 9; x++) 
			rowTotal += row [x];
		if (rowTotal != 45)
			flag = false;
		return flag;
	}
	
	public static boolean  checkCol (int [] col) {
		boolean flag = true;
		int colTotal = 0;
		for (int x = 0; x < 9; x++) 
			colTotal += col [x];
		if (colTotal != 45)
			flag = false;
		return flag;
	}
	
	public static boolean  checkSqr (int [][] row) {
		boolean flag = true;
		int sqrTotal = 0;
		for (int x = 0; x < 9; x++) 
			for (int y = 0; y < 9; y++) 
				sqrTotal += row [x][y];
		if (sqrTotal != 45)
			flag = false;
		return flag;
	}
	
	public static boolean  amountNum (int [][] sudoku, int num) {
		boolean flag = true;
	
		return flag;
	}
	
	public static void main(String[] args) {
	
	}

}
