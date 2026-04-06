package array;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 2, 3, 4, 4 };
		System.out.print("After Removing Duplicate Elements : ");
		for (int i = 0; i < arr.length; i++) {
			boolean dup = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					dup = true;
					break;
				}
			}
			if (!dup) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
