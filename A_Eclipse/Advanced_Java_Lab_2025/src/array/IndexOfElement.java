package array;

public class IndexOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 10, 15, 20 };
		int key = 15;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Index: " + i);
				return;
			}
		}

		System.out.println("Not Found");
	}
}
