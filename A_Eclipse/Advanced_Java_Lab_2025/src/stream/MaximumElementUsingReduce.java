package stream;

import java.util.Arrays;
import java.util.List;

public class MaximumElementUsingReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(5, 12, 3, 21, 8);
		int max = numbers.stream().reduce(numbers.get(0), (a, b) -> Math.max(a, b));

		System.out.println("The highest number is: " + max);

	}

}
