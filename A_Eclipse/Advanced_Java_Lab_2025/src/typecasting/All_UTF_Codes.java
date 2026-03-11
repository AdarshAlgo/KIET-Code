package typecasting;
import java.util.*;

public class All_UTF_Codes {

	static public void main(String... args) {
		
		String a ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789`~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/? ";
		
		for(int i =0;i<a.length();i++) {
		char b = a.charAt(i);
		int c = b;
		System.out.println(b +" : "+ c);
		}
	}
}
