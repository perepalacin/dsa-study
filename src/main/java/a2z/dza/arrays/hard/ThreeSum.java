// https://leetcode.com/problems/3sum/description/
package a2z.dza.arrays.hard;

import a2z.dza.basic_sorting.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        // Try to fix a number and then use two sum to find the solution!
        nums = Arrays.stream(nums).sorted().toArray();
        List<List<Integer>> result = new ArrayList<>();
//        QuickSort.quickSort(nums, 0, nums.length-1);
        int previousNum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == previousNum) {
                continue;
            }
            int left = i+1, right = nums.length-1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add((Stream.of(nums[i], nums[left],nums[right]).toList()));
                    left++;
                    while (nums[left] == nums[left-1] && left < right) {
                        left++;
                    }
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
            previousNum = nums[i];
        }
        return result;
    }
}
