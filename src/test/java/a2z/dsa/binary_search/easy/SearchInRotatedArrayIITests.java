package a2z.dsa.binary_search.easy;

import org.junit.Assert;
import org.junit.Test;

import a2z.dza.binary_search.easy.SearchInRotatedArrayII;

public class SearchInRotatedArrayIITests {
 
    
    @Test
    public void Test1() {
        Assert.assertTrue(SearchInRotatedArrayII.search(new int[]{2,5,6,0,0,1,2}, 0));
    }


    @Test
    public void Test2() {
        Assert.assertFalse(SearchInRotatedArrayII.search(new int[]{2,5,6,0,0,1,2}, 3));
    }


    @Test
    public void Test3() {
        Assert.assertTrue(SearchInRotatedArrayII.search(new int[]{3,4,5,6,3,3,3,3,3,3}, 5));
    }
}
