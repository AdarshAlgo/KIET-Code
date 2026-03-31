package stream;

import java.util.*;
import java.util.stream.*;

public class SortedNumbersSquareSumTop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(2, 5, 3, 8, 1, 7);

		List<Integer> result = numbers.stream().map(n -> n * n).sorted(Comparator.reverseOrder()).limit(4)
				.collect(Collectors.toList());

		System.out.println(result);
	}

}
