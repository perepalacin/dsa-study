package a2z.dsa.binary_search.two_dimensional_arrays;

import a2z.dza.binary_search.two_dimensional_arrays.FindRowWithMaxNumOfOnes;
import org.junit.Assert;
import org.junit.Test;

public class FindRowWithMaxNumOfOnesTests {

    @Test
    public void Test1() {
        Assert.assertEquals(2, FindRowWithMaxNumOfOnes.rowWithMax1s(new int[][]{new int[]{0,1,1,1}, new int[]{0,0,1,1}, new int[]{1,1,1,1}, new int[]{0,0,0,0}}));
    }


    @Test
    public void Test2() {
        Assert.assertEquals(1, FindRowWithMaxNumOfOnes.rowWithMax1s(new int[][]{new int[]{0,0}, new int[]{1,1}}));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(-1, FindRowWithMaxNumOfOnes.rowWithMax1s(new int[][]{new int[]{0,0}, new int[]{0,0}}));
    }

    @Test
    public void Test4() {
        Assert.assertEquals(2, FindRowWithMaxNumOfOnes.rowWithMax1s(new int[][]{new int[]{0,1,1,1}, new int[]{0,0,0,0}, new int[]{1,1,1,1}, new int[]{0,0,0,1}, new int[]{0,1,1,1}, new int[]{0,0,0,1}, new int[]{0,0,0,1}}));
    }
}
