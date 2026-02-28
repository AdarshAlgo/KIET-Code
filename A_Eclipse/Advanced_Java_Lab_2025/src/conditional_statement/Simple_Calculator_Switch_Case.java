package conditional_statement;

import java.util.Scanner;
public class Simple_Calculator_Switch_Case {
	

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        int a = s.nextInt();
	        int b = s.nextInt();
	        int c = s.nextInt();

	        switch (c) {
	            case 1:
	                System.out.println(a + b);
	                break;
	            case 2:
	                System.out.println(a - b);
	                break;
	            default:
	                System.out.println("Invalid");
	        }
	        
	        s.close();
	    }
	}
