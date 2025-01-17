package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.TwoSum;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TwoSumTests {

    @Test
    public void Test1() {
        Assert.assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(new int[]{1,2}, TwoSum.twoSum(new int[]{3,2,4}, 6));
    }

    @Test
    public void Test3() {
        Assert.assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{3,3}, 6));
    }
}
