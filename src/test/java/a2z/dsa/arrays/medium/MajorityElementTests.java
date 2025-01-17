package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.MajorityElement;
import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTests {

    @Test
    public void Test1() {
        Assert.assertEquals(3, MajorityElement.majorityElement(new int[]{3,2,3}));
    }


    @Test
    public void Test2() {
        Assert.assertEquals(2, MajorityElement.majorityElement(new int[]{2,2,1,1,2,2}));
    }
}
