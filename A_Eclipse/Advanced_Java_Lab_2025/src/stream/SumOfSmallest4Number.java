package stream;

import java.util.*;
import java.util.stream.*;

public class SumOfSmallest4Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(2, 5, 3, 8, 1, 7);

		int sum = numbers.stream().sorted().limit(4).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}
