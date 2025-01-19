package a2z.dsa.arrays.medium;

import a2z.dza.arrays.medium.BestTimeToBuyAndSell;
import org.junit.Assert;
import org.junit.Test;

public class BestTImeToBuyAndSellTests {

    @Test
    public void Test1() {
        Assert.assertEquals(5, BestTimeToBuyAndSell.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(0, BestTimeToBuyAndSell.maxProfit(new int[]{7,6,4,3,1}));
    }
}
