
public class insertSort {

	public static int shiftBigger (int [] items, int nextPos, int nextVal) {
	boolean done = false;
	while (nextPos > 0 && !done) {
		if (items [nextPos - 1] > nextVal) {
			items [nextPos] = items [nextPos - 1];
			nextPos--;
		}
		else 
			done = true;
	}
		return nextPos;
	}
	
	public static void insSort (int [] items) {
		int nextVal; int newPos;
		for (int nextPos = 1; nextPos < items.length; nextPos++) {
			nextVal = items [nextPos];
			newPos = shiftBigger (items, nextPos, nextVal);
			items [newPos] = nextVal;
		}
	}
	
	public static void display (int [] items) {
		for (int x = 0; x < items.length; x++) 
			System.out.println(items [x]);
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] myArray = new int [] {2, -6, 11, 1, 8, 10};
		insSort(myArray);
		display(myArray);	
	}

}
