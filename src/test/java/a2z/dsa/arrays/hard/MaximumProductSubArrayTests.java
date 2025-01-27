package a2z.dsa.arrays.hard;

import a2z.dza.arrays.hard.MaximumProductSubArray;
import org.junit.Assert;
import org.junit.Test;

public class MaximumProductSubArrayTests {

    @Test
    public void Test1() {
        Assert.assertEquals(6, MaximumProductSubArray.maxProduct(new int[]{2,3,-2,4}));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(0, MaximumProductSubArray.maxProduct(new int[]{-2,0,-1}));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(56, MaximumProductSubArray.maxProduct(new int[]{1,4,3,0,-2,-4,7}));
    }

    @Test
    public void Test4() {
        Assert.assertEquals(10, MaximumProductSubArray.maxProduct(new int[]{-1,-2,-5,0,0,0,7}));
    }

    @Test
    public void Test5() {
        Assert.assertEquals(24, MaximumProductSubArray.maxProduct(new int[]{2,-5,-2,-4,3}));
    }
}
