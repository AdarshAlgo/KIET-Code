
interface Calc{
        void square(int n1);
}
public class MainFunctionalInterfaceSquare {
       public static void main(String[] args) {

        Calc a1 = num-> num*num;


        // Lambda Expression
        int result = a1.square(20); 
        System.out.println("Square of number is = " + result);

    }
}