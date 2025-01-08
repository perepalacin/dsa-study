package a2z.dsa.basic_recursion;

import a2z.dza.basic_recursion.CheckIfAStringIsPalindrome;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckIfAStringIsPalindromeTests {
    @Test
    public void Test1() {
        assertTrue(CheckIfAStringIsPalindrome.mainFunction("A man, a plan, a canal: Panama"));
    }

    @Test
    public void Test2() {
        assertFalse(CheckIfAStringIsPalindrome.mainFunction("race a car"));
    }

    @Test
    public void Test3() {
        assertTrue(CheckIfAStringIsPalindrome.mainFunction(" "));
    }
}
