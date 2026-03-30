package stream;

import java.util.*;

public class ProductOfElementUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1, 2, 3, 4);

		int product = list.stream().reduce(1, (a, b) -> a * b);

		System.out.println("Product: " + product);

	}

}
