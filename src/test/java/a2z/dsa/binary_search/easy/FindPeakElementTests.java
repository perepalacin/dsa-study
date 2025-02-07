package a2z.dsa.binary_search.easy;

import a2z.dza.binary_search.easy.FindPeakElement;
import org.junit.Assert;
import org.junit.Test;

public class FindPeakElementTests {

    @Test
    public void Test1() {
        Assert.assertEquals(2, FindPeakElement.findPeakElement(new int[]{1,2,3,1}));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(5, FindPeakElement.findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(1, FindPeakElement.findPeakElement(new int[]{1,2}));
    }

    @Test
    public void Test4() {
        Assert.assertEquals(0, FindPeakElement.findPeakElement(new int[]{2,1}));
    }
}
