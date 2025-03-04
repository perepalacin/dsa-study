package a2z.dsa.strings;

import a2z.dza.strings.LargestCommonPrefix;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class LargestCommonPrefixTests {

    @Test
    public void Test1() {
        Assert.assertEquals("fl", LargestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("", LargestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
