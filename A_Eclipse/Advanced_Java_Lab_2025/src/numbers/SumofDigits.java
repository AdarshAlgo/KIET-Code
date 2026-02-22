package numbers;
import java.util.*;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the No. : ");
		int n = sc.nextInt();
		int sum = 0;
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("Sum is : "+sum);
		sc.close();
	}

}
