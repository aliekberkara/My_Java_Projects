package Ornekler;

public class Nesne_Uret {

	public static void main(String[] args) {
		Smart_Phone object1 = new Smart_Phone("Samsung","S21", "Lacivert", 16, 2.3);
		Smart_Phone object2 = new Smart_Phone();
		object1.Bilgileri_Yazdir();
		object1.Hafizayi_Degerlendir(object1.getHiz());
		
		object2.Bilgileri_Yazdir();
		object2.Hafizayi_Degerlendir(object2.getHiz());

	}

}
