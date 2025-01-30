package a2z.dsa.binary_search.easy;

import a2z.dza.binary_search.easy.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTests {

    @Test
    public void Test1() {
        Assert.assertEquals(4, BinarySearch.search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(-1, BinarySearch.search(new int[]{-1,0,3,5,9,12}, 2));
    }
}
