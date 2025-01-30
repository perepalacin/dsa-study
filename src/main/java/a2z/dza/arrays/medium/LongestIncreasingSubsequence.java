package a2z.dza.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
        int[] maxLengths = new int[nums.length];
        maxLengths[0] = 1;
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            int currentLen = 0;
            for (int j = 0; j < maxLengths.length; j++) {
                if (nums[i] > nums[j] && currentLen < maxLengths[j]) {
                    currentLen = maxLengths[j];
                }
            }
            currentLen++;
            maxLengths[i] = currentLen;
            if (currentLen > result) {
                result = currentLen;
            }
        }
        return result;
    }
}
