package Examples;

public class Vowels {

	public static void main(String[] args) {
		String thin = "ei��E���";
		String bold = "a�ouAIOU";
		CharSequence letter = "�";
		if (thin.contains(letter) && letter.length() == 1)
		{
			System.out.println(letter + ", Is A Thin Vowel.");
		}
		else if (bold.contains(letter) && letter.length() == 1)
		{
			System.out.println(letter + ", Is A Bold Vowel.");
		}
		else
		{
			System.out.println("You have entered an invalid character.");
		}
	}

}
