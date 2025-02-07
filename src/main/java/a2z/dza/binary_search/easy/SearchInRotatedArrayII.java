// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
package a2z.dza.binary_search.easy;

public class SearchInRotatedArrayII {
    public static boolean search(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        } else if (nums.length == 1) {
            return nums[0] == target;
        }

        int left = 0, right = nums.length-1;

        while (left <= right) {
            int mid = left + (right-left)/2;

            if (nums[mid] == target) {
                return true;
            }

            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
                continue;
            }

            if (nums[mid] >= nums[left]) {
                //left side is sorted
                if (target >= nums[left] && target <= nums[mid]) {
                    right = mid-1;
                } else {
                    left = mid +1;
                }
            } else if (nums[mid] <= nums[right]) {
                //right side is sorted
                if (target >= nums[mid] && target <= nums[right]) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }

        return  false;
    }
    
}
