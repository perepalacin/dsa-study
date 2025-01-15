package a2z.dsa.arrays.easy;

import a2z.dza.arrays.easy.MoveZeros;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MoveZeroesTests {

    @Test
    public void Test1() {
        int[] arr = {0, 1, 0, 3, 12};
        MoveZeros.moveZeroes(arr);
        assertArrayEquals(new int[] {1, 3, 12, 0, 0}, arr);
    }

    @Test
    public void Test2() {
        int[] arr = {1, 0, 2, 3, 12};
        MoveZeros.moveZeroes(arr);
        assertArrayEquals(new int[] {1, 2, 3, 12, 0}, arr);
    }
}
