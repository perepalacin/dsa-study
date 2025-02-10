package a2z.dsa.binary_search.medium;

import a2z.dza.binary_search.medium.FindMRootOfN;
import org.junit.Assert;
import org.junit.Test;

public class FindMRootOfNTests {

    @Test
    public void Test1() {
        Assert.assertEquals(3, FindMRootOfN.nthRoot(2, 9));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(-1, FindMRootOfN.nthRoot(3, 9));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(14, FindMRootOfN.nthRoot(1, 14));
    }
}
