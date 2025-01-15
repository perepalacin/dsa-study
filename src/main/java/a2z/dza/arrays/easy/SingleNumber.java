// https://leetcode.com/problems/single-number/
package a2z.dza.arrays.easy;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int xorSum = 0;
        for (int i = 0; i < nums.length; i++) {
            xorSum = xorSum ^ nums[i];
        }
        return xorSum;
    }
}
