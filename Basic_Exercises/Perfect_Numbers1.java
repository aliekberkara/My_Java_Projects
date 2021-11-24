/*
Get two numbers from keyboard with JOptionPane. Pass these numbers as parameters to a method.
Find the perfect numbers between these numbers, which are also taken in the method.
(Perfect Number is a number whose sum of all its factors except itself is equal to itself. Example: 6(1+2+3))
*/

package Basic_Exercises;
import javax.swing.JOptionPane;

public class Perfect_Numbers {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null,"Enter a number:");
		String b = JOptionPane.showInputDialog(null,"Enter a number:");
		int number = Integer.parseInt(a);
		int number1 = Integer.parseInt(b);

		perfectNumbers(number, number1);
	}

	public static void perfectNumbers(int number, int number1) {
		while (number <= number1) {
			int total = 0;
			for (int i = 1; i <= number/2; i++) {
				if (number % i == 0) {
					total += i;
				}
			}
			if (number == total) {
				System.out.println(number);
			}
			number++;
		}
	}
}
