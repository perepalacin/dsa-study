package a2z.dsa.arrays.easy;

import a2z.dza.arrays.easy.RemoveDuplicatesFromSortedArray;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTests {

    @Test
    public void Test1() {
        int[] arr = {1, 1, 2};
        int result = RemoveDuplicatesFromSortedArray.removeDuplicates(arr);
        assertEquals(2, result);
        // Ensure the first two elements of arr are {1, 2}
        assertArrayEquals(new int[]{1, 2}, Arrays.copyOfRange(arr, 0, 2));
    }

    @Test
    public void Test2() {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int result = RemoveDuplicatesFromSortedArray.removeDuplicates(arr);
        assertEquals(5, result);
        // Ensure the first two elements of arr are {1, 2}
        assertArrayEquals(new int[]{0,1,2,3,4}, Arrays.copyOfRange(arr, 0, 5));
    }
}
