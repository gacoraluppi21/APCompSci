

public class ArraySort {

	public static int [] assignArray (int [] array) {
		for (int i = 0; i < 10; i++)
			array [i] = (int)(Math.random() * 100 - 50);
		return array;
	}
	
	public static void printArray (int [] printArray) {
		for (int i = 0; i < printArray.length; i ++)
			System.out.println(printArray [i]);
		System.out.println();
	}
	
	public static int [] sortMinToMax (int [] array) {
		for (int i = 0; i < array.length; i++)
		{
			int min = array [i];
			int slot = i;
			for (int j = i; j < array.length; j++)
				if (array [j] < min)
				{
					min = array [j];
					slot = j;
				}
			int switch1 = array [slot];
			array [slot] = array [i];
			array [i] = switch1;
			System.out.println("Step " + (i + 1));
			printArray (array);
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		int [] myArray = new int [10];
		myArray = assignArray(myArray);
		System.out.println("Initial Array");
		printArray (myArray);
		myArray = sortMinToMax(myArray);
	}

}
