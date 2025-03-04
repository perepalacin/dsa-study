// https://leetcode.com/problems/search-a-2d-matrix-ii/description/
package a2z.dza.binary_search.two_dimensional_arrays;

public class SeachIn2DMatrixII {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
