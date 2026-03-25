package steamsorting;

import java.util.*;
public class Skip3Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		list.stream().skip(3).forEach(System.out::println);

	}

}
