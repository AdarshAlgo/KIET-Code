package oops;

class Student {
	private int age;
	private String name;

	Student(int age, String name) {

		this.age = age;
		this.name = name;

		System.out.println("Age is : " + this.age);
		System.out.println("Name is : " + this.name);

	}
}

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student(19, "Adarsh");
	}

}
