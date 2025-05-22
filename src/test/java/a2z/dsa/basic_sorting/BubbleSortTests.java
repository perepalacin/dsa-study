package a2z.dsa.basic_sorting;

import a2z.dza.basic_sorting.BubbleSort;
import a2z.dza.basic_sorting.SelectionSort;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTests {

    @Test
    public void Test1() {
        Assert.assertArrayEquals(new int[]{1, 3, 4 ,7, 9}, BubbleSort.sort(new int[]{4, 1, 3, 9, 7}));
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, BubbleSort.sort(new int[]{10,9,8,7,6,5,4,3,2,1}));
    }

    @Test
    public void Test3() {
        Assert.assertArrayEquals(new int[]{14,20,30,31,38}, BubbleSort.sort(new int[]{38,31,20,14,30}));
    }

    @Test
    public void Test4() {
        Assert.assertArrayEquals(new int[]{5, 15, 17, 29, 34, 48, 50}, BubbleSort.sort(new int[]{15, 17, 50, 5, 34, 48, 29}));
    }

    @Test
    public void Test5() {
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7}, BubbleSort.sort(new int[]{2,3,4,5,6,7,1}));
    }

    @Test
    public void Test6() {
        Assert.assertArrayEquals(new int[]{1, 3, 4 ,7, 9}, BubbleSort.sortTwo(new int[]{4, 1, 3, 9, 7}));
    }

    @Test
    public void Test7() {
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, BubbleSort.sortTwo(new int[]{10,9,8,7,6,5,4,3,2,1}));
    }

    @Test
    public void Test8() {
        Assert.assertArrayEquals(new int[]{14,20,30,31,38}, BubbleSort.sortTwo(new int[]{38,31,20,14,30}));
    }

    @Test
    public void Test9() {
        Assert.assertArrayEquals(new int[]{5, 15, 17, 29, 34, 48, 50}, BubbleSort.sortTwo(new int[]{15, 17, 50, 5, 34, 48, 29}));
    }

    @Test
    public void Test10() {
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7}, BubbleSort.sortTwo(new int[]{2,3,4,5,6,7,1}));
    }
}
