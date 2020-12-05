

public class MatrixMethods {

	public static void display() {}
	
	public static int [] sumRows(int [][] matrix) {
		int [] sumRowMatrix = new int [10];
		for (int r = 0; r < 10; r++) {
			for (int c = 0; c < 10; c++) 
				sumRowMatrix [r] += matrix [r][c];
		}
		return sumRowMatrix;
	}
	
	public static int [] sumCols(int [][] matrix) {
		int [] sumColsMatrix = new int [10];
		for (int r = 0; r < 10; r++) {
			for (int c = 0; c < 10; c++)
				sumColsMatrix [c] += matrix [r][c];
		}		
		return sumColsMatrix;
	}
	
	public static void main(String[] args) {
		
		int [][] myMatrix = new int [10][10];
		for (int r = 0; r < 10; r++) {
			for (int c = 0; c < 10; c++) {
				myMatrix [r][c] = (int)(Math.random() * 100);
				System.out.print(myMatrix [r][c] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		int [] sumRowsMatrix = new int [10];
		sumRowsMatrix = sumRows(myMatrix);
		for (int i = 0; i < 10; i++) 
				System.out.print(sumRowsMatrix [i] + " ");
		System.out.println();
		
		int [] sumColsMatrix = new int [10];
		sumColsMatrix = sumCols(myMatrix);
		for (int i = 0; i < 10; i++) 
			System.out.print(sumColsMatrix [i] + " ");
		System.out.println();

	}

}
