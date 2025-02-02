package a2z.dsa.binary_search.easy;

import a2z.dza.binary_search.easy.CountNumberOfOcurrencesInSortedArray;
import a2z.dza.binary_search.easy.FirstAndLastPositionOfElement;
import org.junit.Assert;
import org.junit.Test;

public class CountNumberOfOcurrencesInSortedArrayTests {
    @Test
    public void Test1() {
        Assert.assertEquals(4, CountNumberOfOcurrencesInSortedArray.countFreq(new int[]{1, 1, 2, 2, 2, 2, 3}, 2));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(0, CountNumberOfOcurrencesInSortedArray.countFreq(new int[]{1, 1, 2, 2, 2, 2, 3}, 4));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(3, CountNumberOfOcurrencesInSortedArray.countFreq(new int[]{8, 9, 10, 12, 12, 12}, 12));
    }
}
