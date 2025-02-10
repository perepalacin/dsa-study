package a2z.dsa.binary_search.medium;

import a2z.dza.binary_search.medium.FindSmallestDivisorGivenAThreshold;
import org.junit.Assert;
import org.junit.Test;

public class FindSmallestDivisorGivenAThresholdTests {

    @Test
    public void Test1() {
        Assert.assertEquals(5, FindSmallestDivisorGivenAThreshold.smallestDivisor(new int[]{1,2,5,9}, 6));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(44, FindSmallestDivisorGivenAThreshold.smallestDivisor(new int[]{44,22,33,11,1}, 5));
    }

}

