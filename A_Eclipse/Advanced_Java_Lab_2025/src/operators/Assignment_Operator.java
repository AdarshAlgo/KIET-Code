package operators;

public class Assignment_Operator {

	public static void main(String[] args) {

		int a = 50;
		int b = 20;
		int c;
		
		c = a;
		System.out.println(c);
		
		c = b;
		System.out.println(c);
		
		a += 10;
		System.out.println(a);
		
		b -= 2;
		System.out.println(b);
		
		a /= 5;
		System.out.println(a);

		b %= 4;
		System.out.println(b);
		
		a *= 2;
		System.out.println(a);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
