package typecasting;

public class ExplicitTypeCasting {

	public static void main(String[] args) {

		double i = 125;
		int j = (int) (i);
		System.out.println(j);
		
		char a = 'Z';
		int b = (int) (a);
		System.out.println(b);
		
		char c = 'z';
		int d = (int) (c);
		System.out.println(d);
		
		char e = ' ';
		int f = (int) (e);
		System.out.println(f);
		
	}

}
