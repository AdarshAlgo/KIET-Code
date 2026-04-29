package array1;

public class SumOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1 }, { 2, 3 }, { 4, 5, 6, 7 } };
		int sum = 0;
		for (int n[] : a) {
			for (int m : n) {
				sum = sum + m;
			}
		}
		System.out.println("Sum of Array : " + sum);
	}

}
