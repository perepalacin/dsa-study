// https://leetcode.com/problems/maximum-subarray/description/
package a2z.dza.arrays.medium;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
//        //Brute force approach:
//        int maxSum = -100001;
//        int currentSum = 0;
//        for (int i = 0; i< nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                currentSum += nums[j];
//                if (currentSum > maxSum) {
//                    maxSum = currentSum;
//                }
//            }
//            currentSum = 0;
//        }
//        return maxSum;

        //Kadane's Algorithm
        int currentSum = 0;
        int maxSum = -10001;
        for (int i = 0; i < nums.length; i++) {
            currentSum+=nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
