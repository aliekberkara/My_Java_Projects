package Examples;

public class Biggest {

	public static void Big(int a, int b) {
		if (a>=b){
			System.out.println("Biggest:"+ a);
		}
		else {
			System.out.println("Biggest:"+ b);
		}
}
	public static void Big(int a, int b, int c) {
		if (a>=b & a>=c) {
			System.out.println("Biggest:"+ a);
		}
		else if(b>=a & b>=c) {
			System.out.println("Biggest:"+ b);
		}
		else {
			System.out.println("Biggest:"+ c);
		}
	}
	public static void main(String[] args) {
		Big(15,25);
		Big(25,36,49);
}
}
