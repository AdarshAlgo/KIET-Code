package string;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java is easy to learn";
		String[] words = str.trim().split("\\s+");

		System.out.println("Word count: " + words.length);
	}
}
