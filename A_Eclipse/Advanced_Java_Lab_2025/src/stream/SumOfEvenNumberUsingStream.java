package stream;

import java.util.*;

public class SumOfEvenNumberUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		int sum = list.stream().filter(x -> x % 2 == 0).reduce(0, (a, b) -> a + b);

		System.out.println("Even Sum: " + sum);
	}
}
