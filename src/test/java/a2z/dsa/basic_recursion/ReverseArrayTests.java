package a2z.dsa.basic_recursion;

import a2z.dza.basic_recursion.ReverseArray;
import a2z.dza.basics.MinimumJumps;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseArrayTests {

    @Test
    public void Test1() {
        Assert.assertArrayEquals(new int [] {1, 4, 3, 2, 6, 5}, ReverseArray.mainFunction(new int[] {5, 6, 2, 3, 4, 1}));
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(new int [] {4, 5, 2}, ReverseArray.mainFunction(new int[] {2, 5, 4}));
    }

    @Test
    public void Test3() {
        Assert.assertArrayEquals(new int [] {1}, ReverseArray.mainFunction(new int[] {1}));
    }
}
