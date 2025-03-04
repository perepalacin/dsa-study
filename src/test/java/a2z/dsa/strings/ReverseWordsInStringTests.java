package a2z.dsa.strings;

import a2z.dza.strings.ReverseWordsInString;
import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInStringTests {

    @Test
    public void Test1() {
        Assert.assertEquals("blue is sky the", ReverseWordsInString.reverseWords("the sky is blue"));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("world hello", ReverseWordsInString.reverseWords("  hello world  "));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("example good a", ReverseWordsInString.reverseWords("a good   example"));
    }
}
