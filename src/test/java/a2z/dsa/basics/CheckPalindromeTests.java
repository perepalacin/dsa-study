package a2z.dsa.basics;

import a2z.dza.basics.CheckPalindrome;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckPalindromeTests {

    @Test
    public void Test1 () {
        assertTrue(CheckPalindrome.isPalindrome(121));
    }

    @Test
    public void Test2 () {
        assertFalse(CheckPalindrome.isPalindrome(-121));
    }

    @Test
    public void Test3 () {
        assertFalse(CheckPalindrome.isPalindrome(10));
    }
}
