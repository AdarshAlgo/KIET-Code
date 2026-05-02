package array1;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int[5][];

		arr[0] = new int[5];
		arr[1] = new int[3];
		arr[2] = new int[4];
		arr[3] = new int[2];
		arr[4] = new int[6];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 1;
			}

		}

		for (int n[] : arr) {
			for (int m : n) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}

}
