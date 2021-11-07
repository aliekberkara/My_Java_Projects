package Ornekler;

import java.util.Scanner;

public class Bubble_Sort {
	public static void main(String[] args) {
		int boyut;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Dizinin Boyutu: ");
			boyut = sc.nextInt();
			
			int [] dizi = new int [boyut];
			
			for (int i = 0; i < boyut; i++) {
				System.out.println("Dizinin " + (i+1) + ". Elemani: ");
				dizi[i] = sc.nextInt();
			}
			
			for (int i = 0; i < boyut; i++) {
				System.out.println("Dizinin " + (i+1) + ". Eleman: "+ dizi[i]);
			}
			
			Bubble_Sort(dizi);
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
			System.out.println("Dizinin " + (i+1) + ". Eleman: "+ array[i]);
		}
	}
}
