package a2z.dsa.binary_search.medium;

import a2z.dza.binary_search.medium.KokoEatingBanannas;
import org.junit.Assert;
import org.junit.Test;

public class KokoEatingBanannasTests {

    @Test
    public void Test1() {
        Assert.assertEquals(4, KokoEatingBanannas.minEatingSpeed(new int[]{3,6,7,11}, 8));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(30, KokoEatingBanannas.minEatingSpeed(new int[]{30,11,23,4,20}, 5));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(23, KokoEatingBanannas.minEatingSpeed(new int[]{30,11,23,4,20}, 6));
    }
}
