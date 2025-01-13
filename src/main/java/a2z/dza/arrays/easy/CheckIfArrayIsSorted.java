// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
package a2z.dza.arrays.easy;

// KISS!!

public class CheckIfArrayIsSorted {
    public static boolean check(int[] nums) {
        int decreases = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (decreases >= 2) {
                return false;
            }
            if (nums[i] > nums[i+1]) {
                decreases++;
            }
        }
        if (nums[nums.length -1] > nums[0]) {
            decreases++;
        }
        return decreases < 2;

    }
}
