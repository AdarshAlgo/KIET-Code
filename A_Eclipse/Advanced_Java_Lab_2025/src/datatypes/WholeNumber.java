package datatypes;

public class WholeNumber {
	
	static public void main(String[] args) {
		
		byte a= 20;
		byte b= 4;
		
		//byte c=(a+b);
		int c = a+b;
		
		System.out.println(c);

		short d = 1;
		short e = 2;
		//short f = e+d;
		int f = e+d;
		
		System.out.println(f);
		
		int g = 300;
		int h = 200;
		int i = g+h;
		
		System.out.println(i);

		long j = 2000000000;
		long k = 2100000000;
		long l = j+k;
		
		System.out.println(l);
		
		long m = 4000000000000000000l;
		long n = 5000000000000000000l;
		long o = m+n;
		
		System.out.println(o);

		long p = 4100000000000000000L;
		long q = 5100000000000000000L;
		long r = p+q;
		
		System.out.println(r);
	}

}
