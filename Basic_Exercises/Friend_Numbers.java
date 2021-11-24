/*If two numbers are equal to the sum of their divisors excluding each other, these numbers are called friend numbers.
 *Example: 220 and 284.
 *220 : 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
 *284 : 1 + 2 + 4 + 71 + 142 = 220*/
package Basic_Exercises;

public class Friend_Numbers {
	public static void main(String[] args) {
		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i <= number1 / 2; i++) {
			if (number1 % i == 0) {
				total1 += i;
			}
		}
		for (int i = 1; i <= number2 / 2; i++) {
			if (number2 % i == 0) {
				total2 += i;
			}
		}
		if (number1 == total2 && number2 == total1) {
			System.out.println(number1 + " And " + number2 + " Is A Friend Numbers.");
		}
		else {
			System.out.println(number1 + " And " + number2 + " Is Not A Friend Numbers.");
		}
	}
}
