package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.RotateMatrix;
import org.junit.Assert;
import org.junit.Test;

public class RotateMatrixTests {

    @Test
    public void Test1() {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};
        RotateMatrix.rotate(input);
        Assert.assertArrayEquals(expected, input);
    }

    @Test
    public void Test2() {
        int[][] input = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] expected = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        RotateMatrix.rotate(input);
        Assert.assertArrayEquals(expected, input);
    }
}
