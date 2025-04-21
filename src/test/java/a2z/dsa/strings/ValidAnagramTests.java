package a2z.dsa.strings;

import a2z.dza.strings.ValidAnagram;
import org.junit.Assert;
import org.junit.Test;

public class ValidAnagramTests {

    @Test
    public void Test1() {
        Assert.assertTrue(ValidAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void Test2() {
        Assert.assertFalse(ValidAnagram.isAnagram("rat", "car"));
    }

    @Test
    public void Test3() {
        Assert.assertFalse(ValidAnagram.isAnagram("ab", "a"));
    }
}
