package Software;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number, term_of_office, age;
		String name, surname;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter Number Of Software Developer: ");
			number = scanner.nextInt();
			Software_Developer developers[] = new Software_Developer[number];
			for (int i = 0; i < number; i++) {
				scanner.nextLine();
				System.out.print("Enter " + (i+1) + ". Software Developer's Name: ");
				name = scanner.nextLine();
				System.out.print("Enter " + (i+1) + ". Software Developer's Surname: ");
				surname = scanner.nextLine();
				System.out.print("Enter " + (i+1) + ". Software Developer's Age: ");
				age = scanner.nextInt();
				System.out.print("Enter " + (i+1) + ". Software Developer's Term Of Office: ");
				term_of_office = scanner.nextInt();
				developers[i] = new Software_Developer(name, surname, age, term_of_office);
				System.out.println("----------------------------------");
			}
			developers[number-1].NumberOfEmployees();
			for (int i = 0; i < number; i++) {
				developers[i].PrintInformations();
				developers[i].CalculateIncrease();
			}
			
		}
	}
}
