/*
Enter two words from the keyboard. Write the codes of the application that checks whether these words are Anagrams.
(An anagram is when letters in a word or phrase are swapped to form another word. For example, "brief" and "fiber" are anagrams.)
*/

package Basic_Exercises;
import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter a two words: ");
		try (Scanner scan = new Scanner(System.in)) {
			String word1 = scan.nextLine();
			String word2 = scan.nextLine();

			char[] sequence1 = new char[word1.length()];
			char[] sequence2 = new char[word2.length()];

			sequence1 = word1.toCharArray();
			sequence2 = word2.toCharArray();

			Arrays.sort(sequence1);
			Arrays.sort(sequence2);

			if(Arrays.equals(sequence1, sequence2) == true) {
				System.out.println("The words " + word1 + " and " + word2 + " are Anagram words.");
			}
			else {
				System.out.println("The words " + word1 + " and " + word2 + " are not Anagram words.");
			}
		}

	}

}
