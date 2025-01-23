// https://leetcode.com/problems/pascals-triangle/description/
package a2z.dza.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    // Iterative approach:
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows > 0) {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);
        }

        for (int i = 0; i < numRows - 1; i++) {
            result.add(populateList(result.get(i)));
        }
        return result;
    }

    public static List<Integer> populateList (List<Integer> previousRow) {
        List<Integer> currentRow = new ArrayList<>();
        for (int i = 0; i < previousRow.size(); i++) {
            if (i == 0) {
                currentRow.add(previousRow.get(i));
            } else {
                currentRow.set(i, currentRow.get(i) + previousRow.get(i));
            }
            currentRow.add(previousRow.get(i));
        }
        return currentRow;
    }
}
