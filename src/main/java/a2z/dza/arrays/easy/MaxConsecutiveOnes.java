// https://leetcode.com/problems/max-consecutive-ones/submissions/1509835751/
package a2z.dza.arrays.easy;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 0;
        int currentLength = 0;
        for (int i=0; i < nums.length; i++) {
            if (nums[i] == 0) {
                currentLength = 0;
            } else {
                currentLength++;
                if (currentLength>maxLength) {
                    maxLength = currentLength;
                }
            }
        }
        return maxLength;
    }
}
