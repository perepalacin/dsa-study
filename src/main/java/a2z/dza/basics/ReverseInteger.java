package a2z.dza.basics;

// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public static int reverse(int x) {
        long result = 0L;
        int remainingDigits = x;
        while (remainingDigits != 0) {
            int lastDigit = remainingDigits % 10;
            result = (result * 10) + lastDigit;
            remainingDigits = (remainingDigits - lastDigit) / 10;
        }
        if (result < Integer.MAX_VALUE && result > Integer.MIN_VALUE) {
            return (int) result;
        } else {
            return 0;
        }
    }
}
