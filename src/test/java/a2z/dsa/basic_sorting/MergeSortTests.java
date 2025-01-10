package a2z.dsa.basic_sorting;

import a2z.dza.basic_sorting.InsertionSort;
import a2z.dza.basic_sorting.MergeSort;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortTests {
    @Test
    public void Test1() {
        Assert.assertArrayEquals(new int[]{1, 3, 4 ,7, 9}, MergeSort.sort(new int[]{4, 1, 3, 9, 7}, 0, 4));
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, MergeSort.sort(new int[]{10,9,8,7,6,5,4,3,2,1}, 0 ,9));
    }

    @Test
    public void Test3() {
        Assert.assertArrayEquals(new int[]{14,20,30,31,38}, MergeSort.sort(new int[]{38,31,20,14,30}, 0, 4));
    }

    @Test
    public void Test4() {
        Assert.assertArrayEquals(new int[]{5, 15, 17, 29, 34, 48, 50}, MergeSort.sort(new int[]{15, 17, 50, 5, 34, 48, 29}, 0, 6));
    }

    @Test
    public void Test5() {
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7}, MergeSort.sort(new int[]{2,3,4,5,6,7,1}, 0, 6));
    }


    @Test
    public void Test6() {
        Assert.assertArrayEquals(new int[]{808, 8528, 9208}, MergeSort.sort(new int[]{8528, 9208, 808}, 0, 2));
    }


}
