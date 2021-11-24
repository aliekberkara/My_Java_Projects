/*
Define an array and ask the user to enter the number of elements of the array. After creating an array of user-desired length,
retrieve the elements of this one-dimensional array from the user using the JOptionPane and populate the array.
*/

package Basic_Exercises;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog(null, "Enter the length of the array:");
		int length = Integer.parseInt(number);
		int[] array = new int[length];

		for (int i = 0; i < array.length; i++) {
			String element = JOptionPane.showInputDialog(null, "Enter the " + (i+1) + ". element of the array:");
			array[i] = Integer.parseInt(element);
		}
		JOptionPane.showMessageDialog(null, Arrays.toString(array));

	}
}
