// https://leetcode.com/problems/4sum/description/
package a2z.dza.arrays.hard;

import a2z.dza.basic_sorting.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
//        QuickSort.quickSort(nums, 0, nums.length-1);
        nums = Arrays.stream(nums).sorted().toArray();

        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 4) {
            return result;
        }


        for (int i = 0; i < nums.length-3;) {
            for (int j = i+1; j < nums.length-2;) {
                int left = j+1, right = nums.length-1;
                while (left < right) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];
                    if (sum == target) {
                        result.add(Stream.of(nums[i], nums[j], nums[left], nums[right]).toList());
                        left++;
                        while (nums[left] == nums[left-1] && left < right) {
                            left++;
                        }
                    } else if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
                j++;
                while (j < nums.length && nums[j] == nums[j-1] ) {
                    j++;
                }
            }
            i++;
            while (i < nums.length && nums[i] == nums[i-1] ) {
                i++;
            }
        }
        return result;
    }

}
