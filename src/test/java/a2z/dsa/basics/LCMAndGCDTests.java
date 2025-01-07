package a2z.dsa.basics;

import a2z.dza.basics.LCMAndGCD;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCMAndGCDTests {

    @Test
    public void Test1() {
        Assert.assertArrayEquals(LCMAndGCD.lcmAndGcd(5, 10), new int[]{10, 5});
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(LCMAndGCD.lcmAndGcd(14, 8), new int[]{56, 2});
    }

    @Test
    public void Test3() {
        Assert.assertArrayEquals(LCMAndGCD.lcmAndGcd(1, 1), new int[]{1, 1});
    }
}
