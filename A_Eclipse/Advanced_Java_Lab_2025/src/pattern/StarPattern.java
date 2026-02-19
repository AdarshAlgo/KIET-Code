package pattern;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		int j =0;
		while(i<5) {
			j=0;
			while(j<=i) {
				//j=0;
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}