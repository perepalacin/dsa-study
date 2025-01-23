package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.TwoSumII;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumIITests {
    @Test
    public void Test1() {
        Assert.assertArrayEquals(new int[]{1,2}, TwoSumII.twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(new int[]{1,3}, TwoSumII.twoSum(new int[]{2,3,4}, 6));
    }

    @Test
    public void Test3() {
        Assert.assertArrayEquals(new int[]{1,2}, TwoSumII.twoSum(new int[]{-1,0}, -1));
    }
}
