// https://leetcode.com/problems/largest-odd-number-in-string/
package a2z.dza.strings;

import java.math.BigInteger;

public class LargestOddNumberInString {
    public static String largestOddNumber(String num) {
        BigInteger largestOdd = new BigInteger("0");
        BigInteger currentNum = new BigInteger("0");
        for (int i = 0;  i < num.length(); i++) {
            currentNum = currentNum.multiply(new BigInteger("10"));
            currentNum = currentNum.add(new BigInteger(String.valueOf(num.charAt(i))));
            if (currentNum.mod(new BigInteger("2")).equals(new BigInteger("1")) && currentNum.compareTo(largestOdd) > 0) {
                largestOdd = currentNum;
            }
        }
        return largestOdd.equals(new BigInteger("0")) ? "" : largestOdd.toString();
    }
}
