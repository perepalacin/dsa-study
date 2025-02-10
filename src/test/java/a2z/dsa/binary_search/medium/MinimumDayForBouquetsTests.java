package a2z.dsa.binary_search.medium;

import a2z.dza.binary_search.medium.MinimumDayForBouquets;
import org.junit.Assert;
import org.junit.Test;

public class MinimumDayForBouquetsTests {

    @Test
    public void Test1() {
        Assert.assertEquals(3, MinimumDayForBouquets.minDays(new int[]{1,10,3,10,2}, 3, 1));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(-1, MinimumDayForBouquets.minDays(new int[]{1,10,3,10,2}, 3, 2));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(12, MinimumDayForBouquets.minDays(new int[]{7,7,7,7,12,7,7}, 2, 3));
    }
}
