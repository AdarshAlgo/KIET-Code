package alphabet_pattern;

import java.util.*;
public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		
		int n= sc.nextInt();
		int i,j;
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j==0 || i+j==(n+1)/2 || i-j==(n-1)/2)
				{
					System.out.print("*");
				}
				 else if (j> (n)/2) {
					 continue;
					 
				 }
				 else{
						System.out.print(" ");
					}
			}
			System.out.println();
		}
	}

}
