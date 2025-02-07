// https://leetcode.com/problems/find-peak-element/
package a2z.dza.binary_search.easy;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1 || nums[0] > nums[1]) {
            return 0;
        } else if (nums[nums.length-1] > nums[nums.length-2]) {
            return nums.length-1;
        }

        int left = 1, right = nums.length-2;

        while (left <= right) {
            int mid = left + (right-left) / 2;

            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
                return mid;
            } else if (nums[mid] > nums[mid+1]) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }
}
