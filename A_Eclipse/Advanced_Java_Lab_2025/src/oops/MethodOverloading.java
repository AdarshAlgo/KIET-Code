package oops;
class Test{
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public int add(int a, int b,int c) {
		int sum=a+b+c;
		return sum;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test obj = new Test();
		
		int result1 = obj.add(25, 22);
		int result2 = obj.add(12, 23, 31);
				
		System.out.println("Sum of two digits is :  "+result1);
		System.out.println("Sum of three digits is : "+result2);
		
	}

}
