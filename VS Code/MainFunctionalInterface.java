interface Calc{
        void calculate(int n1, int n2);
}
public class MainFunctionalInterface {
       public static void main(String[] args) {

        Calc a1 = (a, b) -> System.out.println("Sum=" + (a + b));

        // Lambda Expression
        a1.calculate(23, 56);   
    }
}
