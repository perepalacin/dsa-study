package a2z.dsa.arrays.hard;

import a2z.dza.arrays.hard.SubarrayWithSumZero;
import org.junit.Assert;
import org.junit.Test;

public class SubarrayWithSumZeroTests {

    @Test
    public void Test1() {
        Assert.assertEquals(5, SubarrayWithSumZero.maxLen(new int[]{15,-2,2,-8,1,7,10,23} ));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(0, SubarrayWithSumZero.maxLen(new int[]{2,10,4} ));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(5, SubarrayWithSumZero.maxLen(new int[]{1,0,-4,3,1,0} ));
    }

    @Test
    public void Test4() {
        Assert.assertEquals(6, SubarrayWithSumZero.maxLen(new int[]{-31, -48, -90, 54, 20, 95, 6, -86, 22} ));
    }
}
