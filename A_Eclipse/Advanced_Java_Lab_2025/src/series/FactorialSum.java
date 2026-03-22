package series;

public class FactorialSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10; 
		double sum = 0.0;

		for (int i = 1; i <= n; i++) {
			sum += (double) i / (i + 1);
		}

		System.out.println("Sum of the series (10) is: " + sum);

	}

}
