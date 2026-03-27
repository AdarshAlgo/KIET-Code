package stream;

import java.util.*;
import java.util.stream.*;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(5, 2, 9, 1, 3);

		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedList);
	}

}
