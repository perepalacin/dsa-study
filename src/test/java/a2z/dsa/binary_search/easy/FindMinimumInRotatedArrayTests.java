package a2z.dsa.binary_search.easy;

import a2z.dza.binary_search.easy.FindKthRotation;
import a2z.dza.binary_search.easy.FindMinimumInRotatedArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class FindMinimumInRotatedArrayTests {

    @Test
    public void Test1() {
        Assert.assertEquals(0, FindMinimumInRotatedArray.findMin(new int[]{4,5,6,7,0,1,2}));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(1, FindMinimumInRotatedArray.findMin(new int[]{3,4,5,1,2}));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(1, FindMinimumInRotatedArray.findMin(new int[]{1}));
    }

    @Test
    public void Test4() {
        Assert.assertEquals(0, FindMinimumInRotatedArray.findMin(new int[]{4,5,6,7,0,1,2}));
    }

    @Test
    public void Test5() {
        Assert.assertEquals(11, FindMinimumInRotatedArray.findMin(new int[]{11,13,15,17}));
    }

    @Test
    public void Test6() {
        Assert.assertEquals(1, FindMinimumInRotatedArray.findMin(new int[]{2,1}));
    }

    @Test
    public void Test7() {
        Assert.assertEquals(1, FindMinimumInRotatedArray.findMin(new int[]{4,5,1,2,3}));
    }

    @Test
    public void Test8() {
        Assert.assertEquals(1, FindMinimumInRotatedArray.findMin(new int[]{3,4,5,6,1,2}));
    }

    @Test
    public void Test9() {
        Assert.assertEquals(6, FindMinimumInRotatedArray.findMin(new int[]{39, 6 ,11, 14, 18, 36, 37, 38}));
    }
}
