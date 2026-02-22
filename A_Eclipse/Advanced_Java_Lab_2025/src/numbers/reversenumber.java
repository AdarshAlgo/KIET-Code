package numbers;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int n2=n;
		int rev =0;
		
		while(n2>0) {
			int n3=n2%10;
			rev = rev*10+n3;
			n2=n2/10;
			
		}
		System.out.println(rev);

	}

}
