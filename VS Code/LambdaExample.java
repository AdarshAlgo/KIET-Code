import java.util.function.Function;

public class LambdaExample {
    public static void main(String[] args) {
        
        Function<String, String> processText = (str) -> {
            String upper = str.toUpperCase();
            
            System.out.println("Log: Processing the word " + str);
            
            return "Processed: " + upper;
        };

        String result = processText.apply("java");
        System.out.println(result);
    }
}
