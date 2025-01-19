package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.MaximumSubarray;
import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayTests {

    @Test
    public void Test1(){
        Assert.assertEquals(6, MaximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    public void Test2(){
        Assert.assertEquals(1, MaximumSubarray.maxSubArray(new int[]{1}));
    }

    @Test
    public void Test3(){
        Assert.assertEquals(23, MaximumSubarray.maxSubArray(new int[]{5,4,-1,7,8}));
    }
}
