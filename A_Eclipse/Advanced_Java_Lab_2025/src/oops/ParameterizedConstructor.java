package oops;

class Student1{

	Student1(){

		System.out.println("Zero Parameterized Constructor");
		
	}
	Student1(int a, String n){
		
		this();
		
		System.out.println("Parameterized Constructor");
		System.out.println(a);
		System.out.println(n);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 obj = new Student1();
		
		Student1 obj1 = new Student1(1,"Abc");

	}

}
