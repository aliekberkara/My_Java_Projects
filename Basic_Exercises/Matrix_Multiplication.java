/*
Define two 3x3 matrices and fill in the loops and the contents of these matrices as you wish.
Then multiply these matrices to create a result matrix.
*/

package Basic_Exercises;
import java.util.Scanner;

public class Matrix_Multiplication {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int matrix1[][] = new int[3][3];
			int matrix2[][] = new int[3][3];
			int result_matrix[][] = new int[3][3];
			System.out.print("Enter the first matrix: ");
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1.length; j++) {
					matrix1[i][j] = scanner.nextInt();
				}
			}
			System.out.print("---------------------------\nEnter the second matrix: ");

			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2.length; j++) {
					matrix2[i][j] = scanner.nextInt();
				}
			}

			for (int i = 0; i < result_matrix.length; i++) {
				for (int j = 0; j < result_matrix.length; j++) {
					result_matrix[i][j] = matrix1[i][j] * matrix2[i][j];
				}
			}
			System.out.print("First Matrix: \n");

			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1.length; j++) {
					System.out.print(matrix1[i][j] + " ");
				}
				System.out.print("\n");
			}

			System.out.print("----------------------------\nSecond Matrix: \n");
			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2.length; j++) {
					System.out.print(matrix2[i][j] + " ");
				}
				System.out.print("\n");
			}
			System.out.print("--------------------------\nResult Matrix: \n");
			for (int i = 0; i < result_matrix.length; i++) {
				for (int j = 0; j < result_matrix.length; j++) {
					System.out.print(result_matrix[i][j] + " ");
				}
				System.out.print("\n");
			}
		}
	}
}
