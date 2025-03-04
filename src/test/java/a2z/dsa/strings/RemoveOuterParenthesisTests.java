package a2z.dsa.strings;

import a2z.dza.strings.RemoveOuterParenthesis;
import org.junit.Assert;
import org.junit.Test;

public class RemoveOuterParenthesisTests {

    @Test
    public void Test1() {
        Assert.assertEquals("()()()", RemoveOuterParenthesis.removeOuterParentheses("(()())(())"));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("()()()()(())", RemoveOuterParenthesis.removeOuterParentheses("(()())(())(()(()))"));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("", RemoveOuterParenthesis.removeOuterParentheses("()()"));
    }
}
