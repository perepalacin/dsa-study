package a2z.dsa.arrays.easy;

import a2z.dza.arrays.easy.MoveZeros;
import a2z.dza.arrays.easy.SortedArraySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedArraySearchTests {

    @Test
    public void Test1() {
        int[] arr = {1, 2, 3, 4, 6};
        assertTrue(SortedArraySearch.searchInSorted(arr, 6));
    }

    @Test
    public void Test2() {
        int[] arr = {1, 2, 4, 5, 6};
        assertFalse(SortedArraySearch.searchInSorted(arr, 3));
    }
    @Test
    public void Test3() {
        int[] arr = {2, 3, 5, 6};
        assertFalse(SortedArraySearch.searchInSorted(arr, 1));
    }
}
