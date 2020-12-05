
public class TableProgram {
	
	public static void main(String[] args) {
		
		double [] miles = new double [100];
		int x = 0;
		for (x = 0; x < 100; x++)
			{
			miles [x] = x * 1.609;
			System.out.println(x + " miles is equal to " + miles [x] + "km");
			}
	}
}
