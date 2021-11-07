package Ornekler;

public class Mukemmel_Sayi {

	public static void main(String[] args) {
		
		int sayi = 8128;
		int toplam = 0;
		
		for (int i = 1; i <= sayi / 2; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}
		if (toplam == sayi) {
			System.out.println(sayi + " Sayisi Mukemmel Sayidir.");
		}
		else {
			System.out.println(sayi + " Sayisi Mukemmel Sayi Degildir.");
		}
	}

}
