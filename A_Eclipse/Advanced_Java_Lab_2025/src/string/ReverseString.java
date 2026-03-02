package string;

public class ReverseString {
		    public static void main(String[] a){
	        String s="hello123";
	        System.out.println(s);
	        for(int i=s.length()-1;i>=0;i--)
	            System.out.print(s.charAt(i));
	    }
}
