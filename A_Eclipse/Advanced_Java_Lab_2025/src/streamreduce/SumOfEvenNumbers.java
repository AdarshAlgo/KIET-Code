package streamreduce;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		int evenSum = numbers.stream().filter(n -> n % 2 == 0).reduce(0, (total, n) -> total + n);

		System.out.println("The sum of even numbers is: " + evenSum);
	}

}
