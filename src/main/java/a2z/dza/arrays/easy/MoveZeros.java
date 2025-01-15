// https://leetcode.com/problems/move-zeroes/
package a2z.dza.arrays.easy;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int indexOfPlacement = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (indexOfPlacement != i) {
                    nums[indexOfPlacement] = nums[i];
                    nums[i] = 0;
                }
                indexOfPlacement++;
            }
        }
    }
}
