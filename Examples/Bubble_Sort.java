/*
 Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 */

package Examples;

import java.util.Scanner;

public class Bubble_Sort {
	public static void main(String[] args) {
		int size;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Array Size: ");
			size = sc.nextInt();
			
			int [] sequence = new int [size];
			
			for (int i = 0; i < size; i++) {
				System.out.println((i+1) + ". element of array: ");
				sequence[i] = sc.nextInt();
			}
			
			for (int i = 0; i < size; i++) {
				System.out.println((i+1) + ". element of array: " + sequence[i] + "\n");
			}
			
			Bubble_Sort(sequence);
		}
	}
	
	public static void Bubble_Sort(int[] array) {
		int temp;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("-----------------------------");
			System.out.println((i+1) + ". element of array: " + array[i]);
		}
	}
}
