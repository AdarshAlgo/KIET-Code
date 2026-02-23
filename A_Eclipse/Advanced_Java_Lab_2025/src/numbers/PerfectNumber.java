package numbers;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int a = sc.nextInt();
		int b =a;
		int sum =0;
		for(int i =1;i<a;i++) {
			if(a%i == 0) {
			sum=sum+i;
			System.out.println(i+"  "+sum);
			}
		}
		if (sum == b) {
			System.out.println(b+" is a Perfect Number");
		}
		else {
			System.out.println(b+" not a Perfect Number");
		}
		sc.close();
	}

}
