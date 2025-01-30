package a2z.dsa.binary_search.easy;

import a2z.dza.binary_search.easy.SearchInsertPosition;
import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTests {
    @Test
    public void Test1() {
        Assert.assertEquals(2, SearchInsertPosition.searchInsert(new int[]{1,3,5,6}, 5));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(1, SearchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(4, SearchInsertPosition.searchInsert(new int[]{1,3,5,6}, 7));
    }
}
