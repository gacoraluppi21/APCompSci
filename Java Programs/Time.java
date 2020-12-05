

public class Time {

	public static void main(String[] args) {
	long totalMillseconds = System.currentTimeMillis();
	long daySeconds = (totalMillseconds / 1000) % 86400;
	long hours = (daySeconds / 3600);
		if (hours <= 5)
			hours += 19;
		else
			hours -= 5;
	long minutes = ((daySeconds % 3600) / 60);	
	long seconds = ((daySeconds % 3600) % 60);
		
	if (seconds < 10 && minutes < 10)
		System.out.println("It is " + hours + ":0" + minutes + ":0" + seconds);
	else if (seconds < 10 && minutes > 10)
		System.out.println("It is " + hours + ":" + minutes + ":0" + seconds);
	else if (minutes < 10 && seconds > 10)	
		System.out.println("It is " + hours + ":0" + minutes + ":" + seconds);
	else 
		System.out.println("It is " + hours + ":" + minutes + ":" + seconds);
	//I added a lot of "extra" lines so as to format it nicely and to have it in EST//
	}
}
