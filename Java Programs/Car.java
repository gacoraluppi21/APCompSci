
public class Car {

	private String model;
	private int year;
	private double price;
	private double presValue;
	
	public Car () {
		model = " ";
		year = 0;
		price = 0;
		presValue = 0;
	}
	
	public Car(String mod, int y, double cost, double presCost) {
		model = mod;
		year = y;
		price = cost;
		presValue = presCost;
	}
	public void updateValue (int yearsOld) {
		presValue = price - (yearsOld * 250);
	}
	public void displayCar () {
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Price: " + price);
		System.out.println("Present Value: " + presValue);
	}
}
