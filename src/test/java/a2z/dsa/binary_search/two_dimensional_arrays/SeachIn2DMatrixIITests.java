package a2z.dsa.binary_search.two_dimensional_arrays;

import a2z.dza.binary_search.two_dimensional_arrays.SeachIn2DMatrixII;
import org.junit.Assert;
import org.junit.Test;

public class SeachIn2DMatrixIITests {

    private static int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
    };

    @Test
    public void Test1() {
        Assert.assertTrue(SeachIn2DMatrixII.searchMatrix(matrix, 5));
    }

    @Test
    public void Test2() {
        Assert.assertFalse(SeachIn2DMatrixII.searchMatrix(matrix, 20));
    }
}
