package stream;

import java.util.*;
public class AdditionOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		        int sum = list.stream().reduce(0, (a, b) -> a + b);

		        System.out.println("Sum: " + sum);
		    }
		}

