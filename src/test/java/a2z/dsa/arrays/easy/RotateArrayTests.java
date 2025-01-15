package a2z.dsa.arrays.easy;

import a2z.dza.arrays.easy.RotateArray;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateArrayTests {

    @Test
    public void Test1() {
        //swap 0 -> 3
        int[] arr = {1,2,3,4,5,6,7};
        //1234567 -> 5; i =4; 4+3 = 7;  -7
        //5671234
        RotateArray.rotate(arr, 3);
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, arr);
    }

    @Test
    public void Test2() {
        int[] arr = {-1,-100,3,99};
        RotateArray.rotate(arr, 2);
        assertArrayEquals(new int[]{3,99,-1,-100}, arr);
    }

    @Test
    public void Test3() {
        int[] arr = {-1};
        RotateArray.rotate(arr, 2);
        assertArrayEquals(new int[]{-1}, arr);
    }

    @Test
    public void Test4() {
        int[] arr = {1, 2};
        RotateArray.rotate(arr, 1);
        assertArrayEquals(new int[]{2, 1}, arr);
    }

    @Test
    public void Test5() {
        int[] arr = {1, 2};
        RotateArray.rotate(arr, 3);
        assertArrayEquals(new int[]{2, 1}, arr);
    }

    @Test
    public void Test6() {
        int[] arr = {1, 2};
        RotateArray.rotate(arr, 0);
        assertArrayEquals(new int[]{1, 2}, arr);
    }
}
