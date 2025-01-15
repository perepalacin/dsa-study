package a2z.dsa.arrays.easy;

import a2z.dza.arrays.easy.LongestSubArrayWithSumK;
import org.junit.Assert;
import org.junit.Test;

public class LongestSubArrayWithSumKTests {

    @Test
    public void Test1() {
        Assert.assertEquals(6, LongestSubArrayWithSumK.longestSubarray(new int[]{10, 5, 2, 7, 1, -10}, 15));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(5, LongestSubArrayWithSumK.longestSubarray(new int[]{-5, 8, -14, 2, 4, 12}, -5));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(0, LongestSubArrayWithSumK.longestSubarray(new int[]{10, -10, 20, 30}, 5));
    }
}
