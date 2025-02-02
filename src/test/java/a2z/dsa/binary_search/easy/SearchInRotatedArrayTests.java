package a2z.dsa.binary_search.easy;

import a2z.dza.binary_search.easy.SearchInRotatedArray;
import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedArrayTests {

    @Test
    public void Test1() {
        Assert.assertEquals(4, SearchInRotatedArray.search(new int[]{4,5,6,7,0,1,2}, 0));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(-1, SearchInRotatedArray.search(new int[]{4,5,6,7,0,1,2}, 3));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(-1, SearchInRotatedArray.search(new int[]{1}, 0));
    }
}
