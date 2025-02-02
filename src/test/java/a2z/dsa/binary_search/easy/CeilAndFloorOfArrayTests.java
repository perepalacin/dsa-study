package a2z.dsa.binary_search.easy;

import a2z.dza.binary_search.easy.CeilAndFloorOfArray;
import org.junit.Assert;
import org.junit.Test;

public class CeilAndFloorOfArrayTests {
    @Test
    public void Test1() {
        Assert.assertArrayEquals(new int[]{6, 8}, CeilAndFloorOfArray.getFloorAndCeil(7, new int[]{5, 6, 8, 9, 6, 5, 5, 6}));
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(new int[]{8, -1}, CeilAndFloorOfArray.getFloorAndCeil(10, new int[]{5, 6, 8, 8, 6, 5, 5, 6}));
    }

    @Test
    public void Test3() {
        Assert.assertArrayEquals(new int[]{23, -1}, CeilAndFloorOfArray.getFloorAndCeil(37, new int[]{17,23}));
    }
}
