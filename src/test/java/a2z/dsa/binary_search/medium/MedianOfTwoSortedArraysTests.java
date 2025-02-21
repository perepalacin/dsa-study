package a2z.dsa.binary_search.medium;

import a2z.dza.binary_search.medium.MedianOfTwoSortedArrays;
import org.junit.Assert;
import org.junit.Test;

public class MedianOfTwoSortedArraysTests {

    @Test
    public void Test1(){
        Assert.assertEquals(2.5D, MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}), 0.1);
    }

    @Test
    public void Test2(){
        Assert.assertEquals(2.0D, MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1,3}, new int[]{2}), 0.1);
    }

    @Test
    public void Test3(){
        Assert.assertEquals(3.5D, MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1,2,3,4,5,6,7,8}, new int[]{1,2,3,4}), 0.1);
    }

    @Test
    public void Test4(){
        Assert.assertEquals(4D, MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1,2,3,4,5,6,7,8}, new int[]{1,2,3,4,5}), 0.1);
    }

    @Test
    public void Test5(){
        Assert.assertEquals(1.0D, MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1}, new int[]{1}), 0.1);
    }


    @Test
    public void Test6(){
        Assert.assertEquals(1.5D, MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1}, new int[]{2}), 0.1);
    }

    @Test
    public void Test7(){
        Assert.assertEquals(2.5D, MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{}, new int[]{2,3}), 0.1);
    }

}
