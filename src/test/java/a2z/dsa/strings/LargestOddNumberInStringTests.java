package a2z.dsa.strings;

import a2z.dza.strings.LargestOddNumberInString;
import org.junit.Assert;
import org.junit.Test;

public class LargestOddNumberInStringTests {

    @Test
    public void Test1() {
        Assert.assertEquals("5", LargestOddNumberInString.largestOddNumber("52"));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("35427", LargestOddNumberInString.largestOddNumber("35427"));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("", LargestOddNumberInString.largestOddNumber("4206"));
    }

    @Test
    public void Test4() {
        Assert.assertEquals("7542351161", LargestOddNumberInString.largestOddNumber("7542351161"));
    }

    @Test
    public void Test5() {
        Assert.assertEquals("239537672423884969653287101", LargestOddNumberInString.largestOddNumber("239537672423884969653287101"));
    }
}
