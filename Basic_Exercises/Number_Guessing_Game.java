package Basic_Exercises;
import java.util.*;

public class Number_Guessing_Game {

	public static void main(String[] args) {
		Random a = new Random();
		int number = a.nextInt(100);
		try (Scanner b = new Scanner(System.in)) {
			int guess, counter = 0;
			while (true) {
				System.out.println("Enter a number:");
				guess = b.nextInt();
				if(guess > number) {
					System.out.println("------------------------\nDown\n------------------------\n");
					counter++;
					continue;
				}
				else if (guess < number) {
					System.out.println("------------------------\nUp\n------------------------\n");
					counter++;
					continue;
				}
				else {
					System.out.println("------------------------\nCongratulations, you hit the number in " + (counter+1) + " moves.");
					break;
				}
			}
		}
	}

}
