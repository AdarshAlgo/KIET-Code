interface Calc{
        String square(int n1);
    }
public class lamda2 {
    public static void main(String[] args) {
        
        Calc a1 = num-> "Square of number is = "+(num*num);

        // Lambda Expression
        String result = a1.square(20);
        System.out.println(result);

    }
}