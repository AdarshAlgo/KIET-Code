package array;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int mid = arr.length / 2;

		System.out.print("First Half: ");
		for (int i = 0; i < mid; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\nSecond Half: ");
		for (int i = mid; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}