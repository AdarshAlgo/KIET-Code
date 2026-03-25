package steamsorting;

import java.util.*;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(10, 5, 20, 3, 15);

		int min = list.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);

		int max = list.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}

}
