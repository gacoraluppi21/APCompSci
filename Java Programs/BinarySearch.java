import java.util.Scanner;
public class BinarySearch {
	
	public static int binarySearch (int target, int [] items) {
	int right = items.length - 1;
	int left = 0;
	int mid = (right + left) / 2;
	while (mid >= left && mid <= right) {
		if (items [mid] == target) 
			return mid;
		else if (items [mid] > target) 
			right = mid - 1;
		else if (items [mid] < target) 
			left = mid + 1;
		mid = (right + left) / 2;
	}
		return -1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		int [] myArray = new int [] {3, 12, 19, 31, 36, 42, 51, 65, 70, 72, 81, 93};
		System.out.println ("What number would you like to search for?");
		int target = input.nextInt();
		if (binarySearch(target, myArray) == -1)
			System.out.println("Your number was not in the array.");
		else
			System.out.println("Your number was at index " + binarySearch(target, myArray) + ".");
		input.close();
	}

}
