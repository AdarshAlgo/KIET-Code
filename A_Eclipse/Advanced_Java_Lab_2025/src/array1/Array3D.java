package array1;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][][] = new int[3][3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					arr[i][j][k] = 1;
				}
			}

		}

		for (int n[][] : arr) {
			for (int m[] : n) {
				for (int o : m) {
					System.out.print(o + " ");
				}
				System.out.print("  ");
				System.out.print("");
			}
			System.out.println("");

		}

	}

}
