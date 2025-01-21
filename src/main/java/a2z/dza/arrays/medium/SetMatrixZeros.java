// https://leetcode.com/problems/set-matrix-zeroes/description/

package a2z.dza.arrays.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        // O(n) space approach
//        Set<Integer> xZeros = new HashSet<>();
//        Set<Integer> yZeros = new HashSet<>();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] == 0) {
//                    xZeros.add(i);
//                    yZeros.add(j);
//                }
//            }
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (xZeros.contains(i) || yZeros.contains(j)) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }

        // We are using a lot of memory duplicating the array so let's use the first row and column as a set to store which rows and colums can be replaced:
        boolean firstColumnHasZeros = false;
        boolean firstRowHasZeros = false;

        for (int i = 0; i < matrix.length; i++) { // i = x
            for (int j = 0; j < matrix[0].length; j++) { // j = y
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        firstRowHasZeros = true;
                    }
                    if (j == 0) {
                        firstColumnHasZeros = true;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowHasZeros) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstColumnHasZeros) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][0] = 0;
            }
        }
    }
}
