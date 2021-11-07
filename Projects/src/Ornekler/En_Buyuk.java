package Ornekler;

public class En_Buyuk {

	public static void Buyuk(int a, int b) {
		if (a>=b){
			System.out.println("En Buyuk:"+ a);
		}
		else {
			System.out.println("En Buyuk:"+ b);
		}
}
	public static void Buyuk(int a, int b, int c) {
		if (a>=b & a>=c) {
			System.out.println("En Buyuk:"+ a);
		}
		else if(b>=a & b>=c) {
			System.out.println("En Buyuk:"+ b);
		}
		else {
			System.out.println("En Buyuk:"+ c);
		}
	}
	public static void main(String[] args) {
		Buyuk(15,25);
		Buyuk(25,36,49);
}
}
