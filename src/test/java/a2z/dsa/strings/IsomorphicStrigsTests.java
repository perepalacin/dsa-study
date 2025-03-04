package a2z.dsa.strings;

import a2z.dza.strings.IsomorphicStrings;
import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStrigsTests {

    @Test
    public void Test1() {
        Assert.assertTrue(IsomorphicStrings.isIsomorphic("egg", "add"));
    }

    @Test
    public void Test2() {
        Assert.assertFalse(IsomorphicStrings.isIsomorphic("foo", "bar"));
    }

    @Test
    public void Test3() {
        Assert.assertTrue(IsomorphicStrings.isIsomorphic("paper", "title"));
    }

    @Test
    public void Test4() {
        Assert.assertFalse(IsomorphicStrings.isIsomorphic("badc", "baba"));
    }
}
