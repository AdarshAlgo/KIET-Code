package lamda_expression;

@FunctionalInterface
interface CheckPalindrome {
	boolean checkPalin(String info);
}

public class PalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPalindrome cp = (String info)->{
			String infoRev = new StringBuilder(info).reverse().toString();
			return infoRev.equals(info);
		};

	}

}
