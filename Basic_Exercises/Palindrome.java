/*
Checking whether the text entered from the keyboard is a palindrome; If the palindrome is not the one that writes the text in capital letters,
first write the code of the application that gives information and then writes the text in lowercase letters.
(Palindrome; text is the text that has the same spelling from the beginning and the end. For example, if you write the text "Eye" backwards,
you will see that it is the same. Therefore, this word is palindrome.)
*/

package Basic_Exercises;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		System.out.println("Enter A Word: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();

		StringBuffer word = new StringBuffer(text);
		StringBuffer word1 = new StringBuffer(word);
		word.reverse();

		if((String.valueOf(word).compareTo(String.valueOf(word1))) == 0) {
			System.out.println("-----------------------\n" + text.toUpperCase());
		}

		else{
			System.out.println("-----------------------\nThis Word Is Not A Palindrome.\n" + text.toLowerCase());
		}
	}
}
