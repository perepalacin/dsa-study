// https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
package a2z.dza.arrays.medium;

public class RearrangeElementsBySign {
    public static int[] rearrangeArray(int[] nums) {
//        // First approach:
//        int[] positives = new int[nums.length/2];
//        int[] negatives = new int[nums.length/2];
//        int pIndex = 0;
//        int nIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) {
//                positives[pIndex] = nums[i];
//                pIndex++;
//            } else {
//                negatives[nIndex] = nums[i];
//                nIndex++;
//            }
//        }
//        pIndex = 0;
//        nIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i % 2 == 0) {
//                nums[i] = positives[pIndex];
//                pIndex++;
//            } else {
//                nums[i] = negatives[nIndex];
//                nIndex++;
//            }
//        }
//        return nums;

        // Second approach a bit more optimized:
        int[] ans = new int[nums.length];
        int pIndex = 0;
        int nIndex = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                ans[pIndex] = nums[i];
                pIndex+=2;
            } else {
                ans[nIndex] = nums[i];
                nIndex+=2;
            }
        }
        return ans;
    }
}
