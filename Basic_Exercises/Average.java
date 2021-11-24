/*
Get 10 numbers from keyboard with Scanner class.
Find the average of the positive ones and the sum of the negative ones from these 10 numbers entered and print them on the screen.
*/

package Basic_Exercises;
import java.util.*;

public class Average {

	public static void main(String[] args) {
		System.out.println("Enter ten numbers: ");
		int total1 = 0, total2 = 0, counter = 0;
		try (Scanner scan = new Scanner(System.in)) {
			for(int i = 0; i < 10; i++) {
				int number = scan.nextInt();
				if(number >= 0) {
					total1 += number;
					counter++;
				}
				else {
					total2 += number;
				}
			}
		}
		System.out.println("------------------------\nAverage of Positive Numbers: " + total1/counter + "\nSum of Negative Numbers: " + total2);

	}

}
