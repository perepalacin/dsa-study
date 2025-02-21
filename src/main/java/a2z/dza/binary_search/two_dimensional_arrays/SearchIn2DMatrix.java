// https://leetcode.com/problems/search-a-2d-matrix/
package a2z.dza.binary_search.two_dimensional_arrays;

public class SearchIn2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0, high = n*m-1;

        while (low <= high) {
            int mid = (low+high)/2;
            int row = mid/m, col = mid % m;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target ) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return false;
    }
}
