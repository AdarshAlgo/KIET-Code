package lamda_expression;

public class convert_to_lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Running thread");			
				}
		
		};
		Runnable r =()-> System.out.println("Running thread";)
	}

}
