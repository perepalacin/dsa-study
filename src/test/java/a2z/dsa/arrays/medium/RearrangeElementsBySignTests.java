package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.RearrangeElementsBySign;
import org.junit.Assert;
import org.junit.Test;

public class RearrangeElementsBySignTests {

    @Test
    public void Test1() {
        Assert.assertArrayEquals(new int[]{3,-2,1,-5,2,-4}, RearrangeElementsBySign.rearrangeArray(new int[]{3,1,-2,-5,2,-4}));
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(new int[]{1,-1}, RearrangeElementsBySign.rearrangeArray(new int[]{-1,1}));
    }
}
