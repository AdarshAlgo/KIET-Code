package array;

public class LinearSearchInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40 };
		int key = 30;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println(key + " Found");
		else
			System.out.println("Not Found");
	}
}
