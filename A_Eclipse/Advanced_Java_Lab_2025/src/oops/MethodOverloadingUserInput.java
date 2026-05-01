package oops;
import java.util.*;

	class Test1{
		int num1,num2,num3;
		public int getData(int a,int b) {
			num1=a;
			num2=b;
			int sum = num1+num2;
			return sum;
		}
		public int getData(int a, int b,int c) {
			num1=a;
			num2=b;
			num3=c;
			int sum=num1+num2+num3;
			return sum;
			
		}
	}

	public class MethodOverloadingUserInput {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num1,num2,num3;

			Scanner sc= new Scanner(System.in);
			
			System.out.print("Enter the Numbers : ");
			
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();

			
			Test1 obj = new Test1();
			
			
			int result1 = obj.getData(num1,num2);
			int result2 = obj.getData(num1,num2,num3);
					
			System.out.println("Sum of Two digits is :  "+result1);
			System.out.println("Sum of Three digits is : "+result2);
			sc.close();
		}

	}
