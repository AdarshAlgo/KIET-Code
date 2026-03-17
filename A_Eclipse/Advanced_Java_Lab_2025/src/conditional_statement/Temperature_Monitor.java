package conditional_statement;

public class Temperature_Monitor {

	public static void main(String[] args) {
		
		int temperature = 25;

		if (temperature > 30) {
		    System.out.println("It's a hot day!");
		} else if (temperature >= 20 && temperature <= 30) {
		    System.out.println("The weather is perfect.");
		} else {
		    System.out.println("It's a bit chilly.");
		}
		
	}

}
