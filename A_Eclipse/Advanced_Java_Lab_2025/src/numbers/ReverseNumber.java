package numbers;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int n2=n;
		int rev =0;
		
		while(n2>0) {
			int n3=n2%10;
			rev = rev*10+n3;
			n2=n2/10;
			
		}
		System.out.println("Reverse Number is : "+rev);
		sc.close();

	}

}
