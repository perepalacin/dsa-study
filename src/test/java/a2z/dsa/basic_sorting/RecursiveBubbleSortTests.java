package a2z.dsa.basic_sorting;

import a2z.dza.basic_sorting.MergeSort;
import a2z.dza.basic_sorting.RecursiveBubbleSort;
import org.junit.Assert;
import org.junit.Test;

public class RecursiveBubbleSortTests {

    @Test
    public void Test1() {
        Assert.assertArrayEquals(new int[]{1, 3, 4 ,7, 9}, RecursiveBubbleSort.sort(new int[]{4, 1, 3, 9, 7}));
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, RecursiveBubbleSort.sort(new int[]{10,9,8,7,6,5,4,3,2,1}));
    }

    @Test
    public void Test3() {
        Assert.assertArrayEquals(new int[]{14,20,30,31,38}, RecursiveBubbleSort.sort(new int[]{38,31,20,14,30}));
    }

    @Test
    public void Test4() {
        Assert.assertArrayEquals(new int[]{5, 15, 17, 29, 34, 48, 50}, RecursiveBubbleSort.sort(new int[]{15, 17, 50, 5, 34, 48, 29}));
    }

    @Test
    public void Test5() {
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7}, RecursiveBubbleSort.sort(new int[]{2,3,4,5,6,7,1}));
    }


    @Test
    public void Test6() {
        Assert.assertArrayEquals(new int[]{808, 8528, 9208}, RecursiveBubbleSort.sort(new int[]{8528, 9208, 808}));
    }

}
