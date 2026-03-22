package series;

public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		double sum = 0.0;

		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}

		System.out.println("Sum of the series (9) is: " + sum);

	}

}
