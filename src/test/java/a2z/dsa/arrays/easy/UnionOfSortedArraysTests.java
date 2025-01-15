package a2z.dsa.arrays.easy;

import a2z.dza.arrays.easy.RotateArray;
import a2z.dza.arrays.easy.UnionOfSortedArrays;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class UnionOfSortedArraysTests {

    @Test
    public void Test1() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        assertEquals(expected, UnionOfSortedArrays.findUnion(a, b));
    }

    @Test
    public void Test2() {
        int[] a = {2, 2, 3, 4, 5};
        int[] b = {1, 1, 2, 3, 4};

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assertEquals(expected, UnionOfSortedArrays.findUnion(a, b));
    }

    @Test
    public void Test3() {
        int[] a = {1, 1, 1, 1, 1};
        int[] b = {2, 2, 2, 2, 2};

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));

        assertEquals(expected, UnionOfSortedArrays.findUnion(a, b));
    }

}
