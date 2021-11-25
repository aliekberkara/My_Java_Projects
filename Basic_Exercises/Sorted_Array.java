/*
Design an algorithm that sorts arrays from smallest to largest without using the Sort() method and implement it in your program.
*/

package Basic_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted_Array {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the array size: ");
			int size = scanner.nextInt();
			int array[] = new int[size];
			System.out.print("Enter the array elements: ");
			for (int i = 0; i < array.length; i++) {
				array[i] = scanner.nextInt();
			}
			System.out.print("--------------------------\n" + Arrays.toString(array));
			SortTheArray(array);
			System.out.print("\n------------------------\n" + Arrays.toString(array));
		}
	}

	public static void SortTheArray(int[] array) {
		int length = array.length, temp;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < length-1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			length--;
		}
	}
}
