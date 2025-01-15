package a2z.dsa.arrays.easy;

import a2z.dza.arrays.easy.SingleNumber;
import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTests {

    @Test
    public void Test1() {
        Assert.assertEquals(4, SingleNumber.singleNumber(new int[]{4,1,2,1,2}));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(1, SingleNumber.singleNumber(new int[]{2,2,1}));
    }
}
