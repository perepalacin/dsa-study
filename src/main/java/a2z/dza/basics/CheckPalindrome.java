// https://leetcode.com/problems/palindrome-number/description/
package a2z.dza.basics;

public class CheckPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversedNumber = 0;
        int remainingDigits = x;
        while (remainingDigits != 0) {
            int lastDigit = remainingDigits % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            remainingDigits = (remainingDigits - lastDigit) / 10;
        }
        return x == reversedNumber;
    }
}
