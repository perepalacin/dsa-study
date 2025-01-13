package a2z.dsa.basic_sorting;

import a2z.dza.basic_sorting.BubbleSort;
import a2z.dza.basic_sorting.QuickSort;
import org.junit.Assert;
import org.junit.Test;

public class QuickSortTests {

    @Test
    public void Test1() {
        int[] arr = {4, 1, 3, 9, 7};
        QuickSort.quickSort(arr, 0, arr.length-1);
        Assert.assertArrayEquals(new int[]{1, 3, 4 ,7, 9}, arr);
    }

    @Test
    public void Test2() {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        QuickSort.quickSort(arr, 0, arr.length-1);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, arr);
    }

    @Test
    public void Test3() {
        int[] arr = {38,31,20,14,30};
        QuickSort.quickSort(arr, 0, arr.length-1);
        Assert.assertArrayEquals(new int[]{14,20,30,31,38}, arr);
    }

    @Test
    public void Test4() {
        int[] arr = {15, 17, 50, 5, 34, 48, 29};
        QuickSort.quickSort(arr, 0, arr.length-1);
        Assert.assertArrayEquals(new int[]{5, 15, 17, 29, 34, 48, 50}, arr);
    }

    @Test
    public void Test5() {
        int[] arr = {2,3,4,5,6,7,1};
        QuickSort.quickSort(arr, 0, arr.length-1);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7}, arr);
    }

}
