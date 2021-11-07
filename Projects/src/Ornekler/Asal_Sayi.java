package Ornekler;

public class Asal_Sayi {

	public static void main(String[] args) {
		int sayi = 15;
		boolean asal = true;
		
		if (sayi < 2) 
		{
			asal = false;
		}
		else 
		{
			for (int i = 2; i <= (sayi / 2); i++) 
			{
				if (sayi % i == 0)
				{
					if (sayi == 2)
					{
						asal = true;
					}
					else
					{
						asal = false;
					}
				}
			}
		}
		
		if (asal == true)
		{
			System.out.println("Bu Sayi Asal Sayidir.");
		}
		else
		{
			System.out.println("Bu Sayi Asal Sayi Degildir.");
		}
	}

}
