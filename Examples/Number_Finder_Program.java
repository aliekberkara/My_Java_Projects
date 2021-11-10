package Examples;

public class Number_Finder_Program {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		int number = 1;
		boolean situation = false;
		
		for (int i : numbers) {
			if (number == i) {
				situation = true;
				break;
			}
		}
		
		if(situation) {
			System.out.println("Number Found. "+ number);
		}
		else {
			System.out.println("Number Not Found.");
		}
	}

}
