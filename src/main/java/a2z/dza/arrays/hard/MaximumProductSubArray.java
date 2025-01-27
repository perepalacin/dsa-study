// https://leetcode.com/problems/maximum-product-subarray/description/
package a2z.dza.arrays.hard;

public class MaximumProductSubArray {
    public static int maxProduct(int[] nums) {
//        // This approach fails to detect subarrays that do not start at the first index!
//        long currentProd = nums[0];
//        long currentMax = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            currentProd *= nums[i];
//            currentMax = Math.max(Math.max(currentMax, currentProd), nums[i]);
//            if (currentProd == 0) {
//                currentProd = 1;
//            }
//        }
//        return (int) currentMax;

        // Kadane's Algorithm approach
        long prod1 = nums[0], prod2 = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            long temp = Math.max(Math.max(prod2*nums[i], prod1*nums[i]), nums[i]);
            prod2 = Math.min(Math.min(prod2*nums[i], prod1*nums[i]), nums[i]);
            prod1 = temp;
            result = Math.max(prod1, result);
        }
        return (int) result;
    }
}
