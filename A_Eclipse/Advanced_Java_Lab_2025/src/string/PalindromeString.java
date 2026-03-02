package string;

import java.util.*;
public class PalindromeString {
	
			public static void main(String[] a){
	        
			Scanner sc = new Scanner(System.in);
			String s= sc.next();;		
			String r="";
	        
			for(int i=s.length()-1;i>=0;i--)
	            r+=s.charAt(i);
	        if(s.equals(r)) System.out.print("Yes");
	        else System.out.print("No");
	        sc.close();
	    }
}
