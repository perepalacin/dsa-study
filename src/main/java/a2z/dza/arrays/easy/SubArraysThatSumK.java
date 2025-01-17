// https://leetcode.com/problems/subarray-sum-equals-k/
package a2z.dza.arrays.easy;

import java.util.ArrayList;

public class SubArraysThatSumK {
    public static int subArraySum(int[] nums, int k) {
        //Exceeds time!
        int sum = 0;
        int candidates = 0;

        ArrayList<Integer> prefixSums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                candidates++;
            }

            for (int j : prefixSums) {
                if (j == sum-k) {
                    candidates++;
                }
            }

            prefixSums.add(sum);
        }

        return candidates;
    }
}
