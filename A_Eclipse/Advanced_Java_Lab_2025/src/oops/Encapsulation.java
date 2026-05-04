package oops;

class Test3 {
	
	private int num1;
	private int num2;
	private int num3;

	public void getData1(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public void getData2(int a, int b, int c) {
		num1=a;
		num2=b;
		num3=c;
	}
	
	public int setData1() {
		int mul =1;
		mul=num1*num2;
		return mul;
	}
	
	public int setData2() {
		int mul =1;
		mul=num1*num2*num3;
		return mul;
	}	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3 obj1 = new Test3();
		Test3 obj2 = new Test3();
		
		obj1.getData1(2, 32);
		obj2.getData2(10,20,10);	
		
		int result1 = obj1.setData1();
		int result2 = obj2.setData2();
		
		System.out.println("Multiply of Two Digits is : "+result1);
		System.out.println("Multiply of Three Digits is : "+result2);

	}

}
