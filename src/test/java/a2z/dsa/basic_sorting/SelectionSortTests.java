package a2z.dsa.basic_sorting;

import a2z.dza.basic_sorting.SelectionSort;
import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTests {

    @Test
    public void Test1() {
        Assert.assertArrayEquals(new int[]{1, 3, 4 ,7, 9}, SelectionSort.sort(new int[]{4, 1, 3, 9, 7}));
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, SelectionSort.sort(new int[]{10,9,8,7,6,5,4,3,2,1}));
    }

    @Test
    public void Test3() {
        Assert.assertArrayEquals(new int[]{14,20,30,31,38}, SelectionSort.sort(new int[]{38,31,20,14,30}));
    }

}
