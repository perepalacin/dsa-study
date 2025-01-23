// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
package a2z.dza.arrays.medium;

import java.util.ArrayList;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        //This is a two pointer problem
        int l = 0, r = numbers.length-1;

        while(l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[]{++l, ++r};
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[]{};
    }
}
