package a2z.dsa.binary_search.medium;

import a2z.dza.binary_search.medium.FindRootOfN;
import org.junit.Assert;
import org.junit.Test;

public class FindRootOfNTests {

    @Test
    public void test1() {
        Assert.assertEquals(2, FindRootOfN.floorSqrt(4));
    }

    @Test
    public void test2() {
        Assert.assertEquals(3, FindRootOfN.floorSqrt(9));
    }

    @Test
    public void test3() {
        Assert.assertEquals(4, FindRootOfN.floorSqrt(16));
    }

    @Test
    public void test4() {
        Assert.assertEquals(1, FindRootOfN.floorSqrt(1));
    }

    @Test
    public void test5() {
        Assert.assertEquals(3, FindRootOfN.floorSqrt(11));
    }
}
