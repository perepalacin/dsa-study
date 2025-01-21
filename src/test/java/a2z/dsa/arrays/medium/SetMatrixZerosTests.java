package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.SetMatrixZeros;
import org.junit.Assert;
import org.junit.Test;

public class SetMatrixZerosTests {

    @Test
    public void Test1() {
        int[][] input = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        SetMatrixZeros.setZeroes(input);
        Assert.assertArrayEquals(expected, input);
    }

    @Test
    public void Test2() {
        int[][] input = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        int[][] expected = {{0,0,0,0}, {0,4,5,0}, {0,3,1,0}};
        SetMatrixZeros.setZeroes(input);
        Assert.assertArrayEquals(expected, input);
    }
}
