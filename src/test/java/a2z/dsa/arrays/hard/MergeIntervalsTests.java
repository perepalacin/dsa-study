package a2z.dsa.arrays.hard;

import a2z.dza.arrays.hard.MergeIntervals;
import org.junit.Assert;
import org.junit.Test;

public class MergeIntervalsTests {

    @Test
    public void Test1() {
        Assert.assertArrayEquals(new int[][] {{1,6},{8,10},{15,18}}, MergeIntervals.merge(new int[][] {{1,3}, {2,6},{8, 10}, {15,18}}));
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(new int[][] {{1,5}}, MergeIntervals.merge(new int[][] {{1,4}, {4,5}}));
    }

    @Test
    public void Test3() {
        Assert.assertArrayEquals(new int[][] {{1,3},{4,7}}, MergeIntervals.merge(new int[][] {{2,3},{2,2},{3,3},{1,3},{5,7},{2,2},{4,6}}));
    }

}
