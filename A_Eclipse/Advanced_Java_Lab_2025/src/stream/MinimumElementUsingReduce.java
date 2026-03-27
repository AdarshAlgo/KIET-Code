package stream;

import java.util.Arrays;
import java.util.List;

public class MinimumElementUsingReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(9, 32, 1, 42, 14);
		int max = numbers.stream().reduce(numbers.get(0), (a, b) -> Math.min(a, b));

		System.out.println("The smallest number is: " + max);

	}

}
