package a2z.dza.arrays.medium;

public class RotateMatrix {
    public static void rotate(int[][] matrix) {

        // Transpose the matrix
        for (int i = 0; i < matrix.length; i++) { // i = x
            for (int j = 0; j < i; j++) { // j = y
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Mirror the matrix
        for (int i = 0; i < matrix.length; i++) { // i = x
            for (int j = 0; j < matrix.length / 2; j++) { // j = y
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}
