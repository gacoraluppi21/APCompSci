
public class RowSums {

	public static int [][] assign (int [][] myMatrix){
		for (int r = 0; r < myMatrix.length; r++) {
			for (int c = 0; c < myMatrix [0].length; c++) {
				myMatrix [r][c] = (int)(Math.random() * 101 - 50);
			}
		}
		return myMatrix;
	}
	
	public static void display (int [][] printMatrix) {
		for (int r = 0; r < printMatrix.length; r++) {
			for (int c = 0; c < printMatrix [0].length; c++) {
				System.out.print(printMatrix [r][c] + "  ");
			}
			System.out.println();
		}
	}
	
	public static int [] rowSums (int [][] givenMatrix) {
	int [] rowSums = new int [givenMatrix.length];
		for (int r = 0; r < givenMatrix.length; r++) {
			for (int c = 0; c < givenMatrix [0].length; c++) {
				rowSums [r] += givenMatrix [r][c];
			}
		}
	return rowSums;
	}
	
	public static int greaterThan (int [][] matrix, int value) {
		int times = 0;
		int [] rowSums = new int [matrix.length];
			rowSums = rowSums(matrix);
		for (int r = 0; r < rowSums.length; r++) {	
			if (rowSums [r] > value)
				times++;
		}
		return times;
	}
	
	public static void main(String[] args) {
		int amount = 0;
		int value = 0;
		int [][] myMatrix = new int [5][5];
		myMatrix = assign(myMatrix);
		display(myMatrix);
		amount = greaterThan (myMatrix, value);
		System.out.println("The sum was greater than your value " + amount + " times.");
	}

}
