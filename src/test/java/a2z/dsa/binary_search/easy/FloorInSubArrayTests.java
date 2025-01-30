package a2z.dsa.binary_search.easy;

import a2z.dza.binary_search.easy.BinarySearch;
import a2z.dza.binary_search.easy.FloorInSubArray;
import org.junit.Assert;
import org.junit.Test;

public class FloorInSubArrayTests {
    @Test
    public void Test1() {
        Assert.assertEquals(-1, FloorInSubArray.findFloor(new int[]{1, 2, 8, 10, 11, 12, 19}, 0));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(1, FloorInSubArray.findFloor(new int[]{1, 2, 8, 10, 11, 12, 19}, 5));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(0, FloorInSubArray.findFloor(new int[]{1, 2, 8}, 1));
    }
}
