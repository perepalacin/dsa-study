package a2z.dza.arrays.easy;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
//        O(n) solution that times out in leetcode
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < nums.length-1; j++) {
//                int temp = nums[j];
//                nums[j] = nums[nums.length-1];
//                nums[nums.length-1] = temp;
//            }
//        }
//        O(k) solution

        k = k % nums.length;

        if (nums.length > 1) {
            reverseArray(nums, 0, nums.length);
            reverseArray(nums, 0, k);
            reverseArray(nums, k, nums.length);
        }
    }

    public static void reverseArray(int[] nums, int low, int high) {
        int j = 0;
        for (int i = low; i < low + (high-low)/2; i++) {
            int temp = nums[i];
            nums[i] = nums[high-j-1];
            nums[high-j-1] = temp;
            j++;
        }
    }

}
