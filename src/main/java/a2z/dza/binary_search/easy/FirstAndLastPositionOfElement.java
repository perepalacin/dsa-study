// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
package a2z.dza.binary_search.easy;

public class FirstAndLastPositionOfElement {
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }
        int index = binarySearch(nums, 0, nums.length-1, target);
        if (index == -1) {
            return new int[]{-1,-1};
        }
        int leftIndex = index;
        for (; leftIndex >= 0; leftIndex--) {
            if (nums[leftIndex] != target) {
                break;
            }
        }
        leftIndex++;
        int rightIndex = index;
        for (; rightIndex < nums.length; rightIndex++) {
            if (nums[rightIndex] != target) {
                break;
            }
        }
        rightIndex--;
        return new int[]{leftIndex, rightIndex};
    }

    public static int binarySearch(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int index = left + (right-left)/2;
        if (nums[index] == target) {
            return index;
        } else if (nums[index] > target) {
            return binarySearch(nums, left, index-1,  target);
        } else {
            return binarySearch(nums, index+1, right, target);
        }
    }
}
