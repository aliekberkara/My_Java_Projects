package Ornekler;

public class Sayi_Bulma {

	public static void main(String[] args) {
		int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		int sayi = 1;
		boolean durum = false;
		
		for (int i : sayilar) {
			if (sayi == i) {
				durum = true;
				break;
			}
		}
		
		if(durum) {
			System.out.println("Sayi Bulundu. "+ sayi);
		}
		else {
			System.out.println("Sayi Bulunamadi.");
		}
	}

}
