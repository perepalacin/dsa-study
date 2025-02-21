package a2z.dsa.binary_search.medium;

import a2z.dza.binary_search.medium.KthElementOfTwoSortedArrays;
import org.junit.Assert;
import org.junit.Test;

public class KthElementOfTwoSortedArraysTests {

    @Test
    public void Test1() {
        Assert.assertEquals(6, KthElementOfTwoSortedArrays.kthElement(new int[]{2,3,6,7,9}, new int[]{1,4,8,10}, 5));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(256, KthElementOfTwoSortedArrays.kthElement(new int[]{100, 112, 256, 349, 770}, new int[]{72, 86, 113, 119, 265, 445, 892}, 7));
    }

}
