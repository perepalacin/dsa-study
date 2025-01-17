//https://leetcode.com/problems/two-sum/description/
package a2z.dza.arrays.medium;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> previousNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (previousNums.containsKey(target-nums[i])){
                return  new int[]{previousNums.get(target-nums[i]), i};
            }
            if (!previousNums.containsKey(nums[i])) {
                previousNums.put(nums[i], i);
            }
        }
        return new int[]{0, 1};
    }
}
