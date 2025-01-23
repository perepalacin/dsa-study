// https://leetcode.com/problems/subarray-sum-equals-k/
package a2z.dza.arrays.easy;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraysThatSumK {
    public static int subArraySum(int[] nums, int k) {
        // Exceeds time! Because we have a nlogn time complexity
        // While this problem can be solved in O(n)
//        int sum = 0;
//        int candidates = 0;
//
//        ArrayList<Integer> prefixSums = new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//
//            if (sum == k) {
//                candidates++;
//            }
//
//            for (int j : prefixSums) {
//                if (j == sum-k) {
//                    candidates++;
//                }
//            }
//
//            prefixSums.add(sum);
//        }
//
//        return candidates;

        // O(n) time and space solution
        int candidates = 0;
        int sum = 0;
        HashMap<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1); // we need to do this so that if sum == k it gets added to the list!
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (prefixSums.containsKey(sum-k)) {
                candidates += prefixSums.get(sum-k);
            }

            prefixSums.put(sum, prefixSums.getOrDefault(sum, 0) + 1);

        }
        return candidates;
    }
}
