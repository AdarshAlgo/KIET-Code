package alphabet_pattern;

import java.util.*;
public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		
		int i,j;
		int n = sc.nextInt();
		 for( i =0;i<n;i++) {
			 for( j =0;j<n;j++) {
				 if(i==0 &&j<n-1 || j==n-1 && i>0 && i<n-1 || i==n-1 && j<n-1 || j==0) {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
	}

}
