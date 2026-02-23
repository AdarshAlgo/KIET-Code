package numbers;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int f=0;
		for (int i =2;i<n;i++) {
			
			if( n%i == 0) {
				f++;
			}
		}
			if(f==0) {
				System.out.println(n+" is a Prime Number");
			}
			else {
				System.out.println(n+" is not a Prime Number");
			}
		sc.close();
	}

}
