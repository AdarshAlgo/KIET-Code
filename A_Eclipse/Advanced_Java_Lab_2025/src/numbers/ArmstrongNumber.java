package numbers;
import java.util.*;

public class ArmstrongNumber {
	
			public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int t = n, r = 0, d = 0, c = n;

	        while (c != 0) {
	            d++;
	            c /= 10;
	        }

	        while (t != 0) {
	            int m = t % 10;
	            r += Math.pow(m, d);
	            t /= 10;
	        }

	        if (r == n)
	            System.out.println("Armstrong Number");
	        else
	            System.out.println("Not Armstrong Number");
	    }
	}
