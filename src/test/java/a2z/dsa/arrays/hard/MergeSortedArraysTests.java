package a2z.dsa.arrays.hard;

import a2z.dza.arrays.hard.MergeSortedArrays;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArraysTests {

    @Test
    public void Test1() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        MergeSortedArrays.merge(nums1, 3, new int[]{2,5,6}, 3);
        Assert.assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }

    @Test
    public void Test2() {
        int[] nums1 = new int[]{1};
        MergeSortedArrays.merge(nums1, 1, new int[]{}, 0);
        Assert.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void Test3() {
        int[] nums1 = new int[]{0};
        MergeSortedArrays.merge(nums1, 0, new int[]{1}, 1);
        Assert.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void Test4() {
        int[] nums1 = new int[]{2,0};
        MergeSortedArrays.merge(nums1, 1, new int[]{1}, 1);
        Assert.assertArrayEquals(new int[]{1,2}, nums1);
    }
}
