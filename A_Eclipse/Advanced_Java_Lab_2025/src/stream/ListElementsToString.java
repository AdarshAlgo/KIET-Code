package stream;

import java.util.Arrays;
import java.util.List;

public class ListElementsToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> wordList = Arrays.asList("Java", "is", "powerful", "and", "fun");

		String reducedSentence = wordList.stream().reduce("", (a, b) -> a + " " + b).trim();

		System.out.println("Input : " + wordList);
		System.out.println("Output : " + reducedSentence);

	}
}
