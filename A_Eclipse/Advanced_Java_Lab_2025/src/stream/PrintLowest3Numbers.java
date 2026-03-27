package stream;

import java.util.*;

public class PrintLowest3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(10, 50, 30, 80, 20, 90, 40);

		numbers.stream().sorted().limit(3).forEach(System.out::println);
	}

}
