package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.MaximumFromSubarrayOfMinimums;
import org.junit.Assert;
import org.junit.Test;

public class MaximumFromSubarrayOfMinimumsTests {

    @Test
    public void Test1() {
        Assert.assertEquals(11, MaximumFromSubarrayOfMinimums.pairWithMaxSum(new int[]{4,3,1,5,6}));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(9, MaximumFromSubarrayOfMinimums.pairWithMaxSum(new int[]{5, 4, 3, 1, 6}));
    }
}
