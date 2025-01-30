// https://leetcode.com/problems/binary-search/
package a2z.dza.binary_search.easy;

import java.util.Arrays;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        return find (nums, 0, nums.length-1, target);
    }

    public static int find(int[] nums, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int index = left + (right-left) / 2;

        if (nums[index] == target) {
            return index;
        } else if (nums[index] > target) {
            return find(nums, left, index - 1, target);
        } else {
            return find(nums, index + 1, right, target);
        }
    }

}
