package lamda_expression;
import java.util.function.Function;
public class squarenum {
	    public static void main(String[] args) {
	        Function<Integer, Integer> square = x -> x * x;
	        int result = square.apply(5);
	        System.out.println(result);
	    }
	}