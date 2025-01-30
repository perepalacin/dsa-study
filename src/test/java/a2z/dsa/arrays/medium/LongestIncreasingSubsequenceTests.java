package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.LongestIncreasingSubsequence;
import org.junit.Assert;
import org.junit.Test;

public class LongestIncreasingSubsequenceTests {

    @Test
    public void Test1() {
        Assert.assertEquals(4, LongestIncreasingSubsequence.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(4, LongestIncreasingSubsequence.lengthOfLIS(new int[]{0,1,0,3,2,3}));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(1, LongestIncreasingSubsequence.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
    }
}
