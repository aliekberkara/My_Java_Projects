/*
Define a one-dimensional array. Pass this array as a parameter to a method. Assign array elements as values using loops within the method,
adding the index of that element to 5.
*/

package Basic_Exercises;
import java.util.*;

public class Add_Five_To_Index {
	public static void main(String[] args) {
		System.out.print("Enter size of array: ");
		try (Scanner scanner = new Scanner(System.in)) {
			int size = scanner.nextInt();

			int array[] = new int[size];
			System.out.println("--------------------------");
			AddFiveToIndex(array);
			System.out.println(Arrays.toString(array));
		}
	}

	public static void AddFiveToIndex(int[] array){
		for (int i = 0; i < array.length; i++) {
			array[i] = i+5;
		}
	}
}
