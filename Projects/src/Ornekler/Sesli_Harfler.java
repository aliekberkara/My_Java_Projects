package Ornekler;

public class Sesli_Harfler {

	public static void main(String[] args) {
		String ince = "ei��E���";
		String kalin = "a�ouAIOU";
		CharSequence harf = "�";
		if (ince.contains(harf) && harf.length() == 1)
		{
			System.out.println(harf + ", Ince Sesli Bir Harftir.");
		}
		else if (kalin.contains(harf) && harf.length() == 1) 
		{
			System.out.println(harf + ", Kalin Sesli Bir Harftir.");
		}
		else
		{
			System.out.println("Gecersiz Bir Karakter Girdiniz.");
		}
	}

}
