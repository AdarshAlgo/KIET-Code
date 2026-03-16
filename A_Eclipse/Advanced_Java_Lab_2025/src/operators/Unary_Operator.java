package operators;

public class Unary_Operator {

	public static void main(String[] args) {

		int a = 4;
		a++;
		System.out.println(a);
		
		int b = 12;
		b--;
		System.out.println(b);
		
		int c = 18;
		++c;
		System.out.println(c);
		
		int d = 22;
		--d;
		System.out.println(d);
		
		int e = 50;
		int f = e++ + ++e + ++e + --e + e-- ;
		System.out.println(f);
	}

}
