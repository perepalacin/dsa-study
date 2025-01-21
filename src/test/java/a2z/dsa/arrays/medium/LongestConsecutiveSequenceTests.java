package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.LongestConsecutiveSequence;
import org.junit.Assert;
import org.junit.Test;

public class LongestConsecutiveSequenceTests {

    @Test
    public void Test1(){
        Assert.assertEquals(6, LongestConsecutiveSequence.longestConsecutive(new int[]{2, 6, 1, 9, 4, 5, 3}));
    }

    @Test
    public void Test2(){
        Assert.assertEquals(4, LongestConsecutiveSequence.longestConsecutive(new int[]{1, 9, 3, 10, 4, 20, 2}));
    }

    @Test
    public void Test3(){
        Assert.assertEquals(7, LongestConsecutiveSequence.longestConsecutive(new int[]{15, 13, 12, 14, 11, 10, 9}));
    }

}
