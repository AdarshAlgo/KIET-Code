package conditional_statement;

import java.util.Scanner;
public class Vowels_and_Consonant_Switch_Case {
	

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        char c = s.next().toLowerCase().charAt(0);

	        switch (c) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println("Vowel");
	                break;
	            default:
	                if (c >= 'a' && c <= 'z') {
	                    System.out.println("Consonant");
	                } else {
	                    System.out.println("Wrong Input");
	                }
	        }
	        s.close();
	    }
	}
