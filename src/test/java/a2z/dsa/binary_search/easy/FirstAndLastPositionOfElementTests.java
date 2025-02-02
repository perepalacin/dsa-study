package a2z.dsa.binary_search.easy;

import a2z.dza.binary_search.easy.FirstAndLastPositionOfElement;
import org.junit.Assert;
import org.junit.Test;

public class FirstAndLastPositionOfElementTests {

    @Test
    public void Test1() {
        Assert.assertArrayEquals(new int[]{3,4}, FirstAndLastPositionOfElement.searchRange(new int[]{5,7,7,8,8,10}, 8));
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(new int[]{-1,-1}, FirstAndLastPositionOfElement.searchRange(new int[]{5,7,7,8,8,10}, 6));
    }

    @Test
    public void Test3() {
        Assert.assertArrayEquals(new int[]{-1,-1}, FirstAndLastPositionOfElement.searchRange(new int[]{}, 0));
    }

    @Test
    public void Test4() {
        Assert.assertArrayEquals(new int[]{0,0}, FirstAndLastPositionOfElement.searchRange(new int[]{1}, 1));
    }

    @Test
    public void Test5() {
        Assert.assertArrayEquals(new int[]{0,1}, FirstAndLastPositionOfElement.searchRange(new int[]{2,2}, 2));
    }

    @Test
    public void Test6() {
        Assert.assertArrayEquals(new int[]{3,4}, FirstAndLastPositionOfElement.searchRange(new int[]{5,7,7,8,8,10}, 8));
    }
}
