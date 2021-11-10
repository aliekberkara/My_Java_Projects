/*
A number is called a "perfect number" if the sum of its divisors is equal to itself.
For example, 6 is a perfect number. (1 + 2 + 3 = 6)
*/

package Examples;

public class Perfect_Numbers {

	public static void main(String[] args) {
		
		int number = 8128;
		int total = 0;
		
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		if (total == number) {
			System.out.println(number + " Is A Perfect Number.");
		}
		else {
			System.out.println(number + " Is Not A Perfect Number.");
		}
	}

}
