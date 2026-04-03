package array;

import java.util.Scanner;

public class CountEvenAndOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int even = 0, odd = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}

		System.out.println(even + " " + odd);
	}
}
