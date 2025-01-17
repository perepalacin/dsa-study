// https://leetcode.com/problems/sort-colors/description/
package a2z.dza.arrays.medium;

import java.util.HashMap;

public class SortColors {
    public static void sortColors(int[] nums) {
//        //First approach with hashmap.
//        HashMap<Integer, Integer> frequencies = new HashMap<>();
//        for (int i : nums) {
//            if (frequencies.containsKey(i)) {
//                int freq = frequencies.get(i);
//                frequencies.put(i, ++freq);
//            } else {
//                frequencies.put(i, 0);
//            }
//        }
//        int index = 0;
//        for (int i = 0; i < 3; i++) {
//            if (frequencies.containsKey(i)) {
//                int j = frequencies.get(i);
//                while (j >= 0) {
//                    nums[index] = i;
//                    index++;
//                    j--;
//                }
//            }
//        }

        // Second Approach using constant memory and O(n) time
        int low = 0, mid = 0, high = nums.length-1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
