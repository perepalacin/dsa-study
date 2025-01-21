// https://leetcode.com/problems/spiral-matrix/submissions/1516258152/
package a2z.dza.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        return spiral(matrix, result, -1, 0, 1, 0, matrix[0].length, matrix.length);
    }

    public static List<Integer> spiral(int[][] matrix, List<Integer> result, int x, int y, int dx, int dy, int m, int n) {
        if (m == 0 || n == 0) {
            return result;
        }

        for (int i = 1; i <= m; i++ ) {
            x += dx;
            y += dy;
            result.add(matrix[y][x]);
        }

        spiral(matrix, result, x, y, -dy, dx, n-1, m);

        return result;
    }

}
