package a2z.dsa.strings;

import a2z.dza.strings.RotateString;
import org.junit.Assert;
import org.junit.Test;

public class RotateStringTests {

    @Test
    public void Test1() {
        Assert.assertTrue(RotateString.rotateString("abcde", "cdeab"));
    }

    @Test
    public void Test2() {
        Assert.assertFalse(RotateString.rotateString("abcde", "abced"));
    }
}
