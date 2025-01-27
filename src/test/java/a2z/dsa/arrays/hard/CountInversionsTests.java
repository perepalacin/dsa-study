package a2z.dsa.arrays.hard;

import a2z.dza.arrays.hard.CountInversions;
import org.junit.Assert;
import org.junit.Test;

public class CountInversionsTests {

    @Test
    public void Test1() {
        Assert.assertEquals(3, CountInversions.inversionCount(new int[]{2, 4, 1, 3, 5}));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(0, CountInversions.inversionCount(new int[]{2, 3, 4, 5, 6}));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(0, CountInversions.inversionCount(new int[]{10, 10, 10}));
    }
}
