package a2z.dsa.binary_search.medium;

import a2z.dza.binary_search.medium.SplitArrayLargestSum;
import org.junit.Assert;
import org.junit.Test;

public class SplitArrayLargestSumTests {

    @Test
    public void Test1() {
        Assert.assertEquals(18, SplitArrayLargestSum.splitArray(new int[]{7,2,5,10,8}, 2));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(9, SplitArrayLargestSum.splitArray(new int[]{1,2,3,4,5}, 2));
    }
}
