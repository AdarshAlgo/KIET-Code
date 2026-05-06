package oops;

class Test5{

	private int age;
	private String name;

	public void setValue(int age, String name) {
		this.age=age;
		this.name=name;
	}
	 public void getValue() {
		 System.out.println("Age : "+ age);
		 System.out.println("Name : "+ name);
	 }
	

}

public class EncapsulationThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test5 obj1 = new Test5();
		Test5 obj2 = new Test5();
		
		obj1.setValue(22, "Nakul");
		obj1.getValue();
		
		obj2.setValue(19, "Arjun");
		obj2.getValue();

	}

}
