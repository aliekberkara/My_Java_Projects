package School;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter Number of Students: ");
			int number = scanner.nextInt();
			Student students[] = new Student[number];
			String name, surname;
			int _final, midterm, i;
			scanner.nextLine();
			
			for(i = 0; i < number; i++){
				System.out.print("Enter " + (i+1) +". Student's Name: ");
				name = scanner.nextLine();
				System.out.print("Enter " + (i+1) +". Student's Surname: ");
				surname = scanner.nextLine();
				System.out.print("Enter " + (i+1) +". Student's Midterm Exam: ");
				midterm = scanner.nextInt();
				System.out.print("Enter " + (i+1) +". Student's Final Exam: ");
				_final = scanner.nextInt();
				scanner.nextLine();
				students[i] = new Student(name, surname, _final, midterm);
				System.out.println("------------------------------------");
			}
			Sort(students);
			for (int j = 0; j < number; j++) {
				students[j].PrintInformations();
				System.out.println("------------------------------------");
			}
			
		}
	}
	
	public static void Sort(Student students[]) {
		Student temp;
		int size = students.length;
		for (int i = 0; i < (size-1); i++) {
			for (int j = 0; j < (size-i-1); j++) {
				if(students[j].CalculatePassingScore(students[j].getMidterm(),students[j].get_final()) > students[(j+1)].CalculatePassingScore(students[(j+1)].getMidterm(),students[(j+1)].get_final())) {
					temp = students[j];
					students[j] = students[(j+1)];
					students[(j+1)] =temp;
				}
			}
			
		}
	}
}
