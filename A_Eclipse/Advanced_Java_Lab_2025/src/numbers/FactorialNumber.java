package numbers;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int fact =1;
		if( n ==0) {
			System.out.println("Factorial is "+1);
		}
		else {
		for (int i =1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial is : "+fact);
		}
	}

}
