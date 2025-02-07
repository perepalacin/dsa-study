package a2z.dsa.binary_search.easy;

import a2z.dza.binary_search.easy.SingleElementInSortedArray;
import org.junit.Assert;
import org.junit.Test;

public class SingleElementInSortedArrayTests {

    @Test
    public void Test1() {
        Assert.assertEquals(2, SingleElementInSortedArray.singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(4, SingleElementInSortedArray.singleNonDuplicate(new int[]{1,1,2,2,3,3,4,8,8}));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(10, SingleElementInSortedArray.singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }
}
