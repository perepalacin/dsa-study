// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
package a2z.dza.binary_search.easy;

public class SearchInRotatedArray {
    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }

    public static int binarySearch(int[] nums,int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int index = left + (right-left) / 2;
        if (nums[index] == target) {
            return index;
        } else if (nums[index] > target) {
            if (nums[0] > target) {
                return binarySearch(nums, index+1, nums.length-1, target);
            } else {
                return binarySearch(nums, 0, index-1, target);
            }
        } else {
            return binarySearch(nums, left, index-1, target);
        }

    }
}
