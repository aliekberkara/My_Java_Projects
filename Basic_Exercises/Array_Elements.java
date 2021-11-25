/*
Create an array that takes a one-dimensional "int" type.
The first element of the sum of the elements of this array; the product of the elements of the second element;
the third element of the sum of odd numbers; change the sum of even numbers to the fourth element.
Example:
[2, 4, 5, 9]
[20, 360, 14, 6]
*/

package Basic_Exercises;
import java.util.Arrays;

public class Array_Elements {

	public static void main(String[] args) {
		int array[] = {2, 4, 5, 9};
		System.out.println("First Array: " + Arrays.toString(array));
		ReplaceElementsOfArray(array);
		System.out.println("Second Array: " + Arrays.toString(array));
	}

	public static void ReplaceElementsOfArray(int array[]) {
		int total = 0, product = 1, total_even = 0, total_odd = 0;
		for (int i : array) {
			total += i;
			product *= i;
			if(i % 2 == 0) {
				total_even += i;
			}
			else {
				total_odd += i;
			}
		}
		array[0] = total;
		array[1] = product;
		array[2] = total_odd;
		array[3] = total_even;
	}

}
