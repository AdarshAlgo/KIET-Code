package oops;

 class Test4{
	
	byte a;
	short b;
	int c;
	long d;
	
	float e;
	double f;
	
	boolean g;
	
	char h; 
	String i;
	
	public void display() {
		System.out.println("Byte : "+ a);
		System.out.println("Short : "+ b);
		System.out.println("int : "+ c);
		System.out.println("long : "+ d);
		
		System.out.println("float : "+ e);
		System.out.println("double : "+ f);
		
		System.out.println("boolean : "+ g);
		
		System.out.println("char : "+ h);
		System.out.println("String : "+ i);
	}

}
 
public class DeafultValueOfInstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Test4 obj = new Test4();
		obj.display();
		
	}

}
