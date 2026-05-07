package oops;

class Student2 {

	Student2() {
		System.out.println("Zero Parameterized Constructor");

	}

	Student2(int a) {
		this();
		System.out.println(a);

	}

	Student2(double b) {
		this();
		System.out.println(b);

	}

	Student2(String c) {
		this();
		System.out.println(c);

	}

	Student2(int a, String name) {
		this();
		System.out.println(a);
		System.out.println(name);

	}

	Student2(int a, double b, String name) {
		this(2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);

	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 o = new Student2();
		Student2 ob = new Student2(1);
		Student2 obj = new Student2(2.0);
		Student2 obje = new Student2("Adarsh");
		Student2 objec = new Student2(4, "Adarsh");
		Student2 object = new Student2(4, 5.0, "Adarsh");

	}

}
