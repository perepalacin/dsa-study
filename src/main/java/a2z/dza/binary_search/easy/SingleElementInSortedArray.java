// https://leetcode.com/problems/single-element-in-a-sorted-array/description/
package a2z.dza.binary_search.easy;

public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        // edge cases:
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[nums.length-1] != nums[nums.length-2]) {
            return nums[nums.length-1];
        }

        int left = 1, right = nums.length-2;

        while (left <= right) {
            int mid = left + (right-left) / 2;

            if (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
                return nums[mid];
            } else if (nums[mid] == nums[mid+1]) {
                if (mid % 2 == 0) {
                    left = mid + 2;
                } else {
                    right = mid - 1;
                }
            } else if (nums[mid] == nums[mid-1]) {
                if (mid % 2 == 0) {
                    right = mid - 2;
                } else {
                    left = mid + 1;
                }
            }

        }
        return -1;
    }
}
