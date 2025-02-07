// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
package a2z.dza.binary_search.easy;

public class SearchInRotatedArray {
//    public static boolean search(int[] nums, int target) {
//        int left = 0, right = nums.length-1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (nums[mid] == target) {
//                return true;
//            }
//
//            // This means the left side is sorted
//            if (nums[left] <= nums[mid]) {
//                if (target > nums[mid] || target < nums[left]) {
//                    // the target is not inside the left part so we discard it
//                    left = mid + 1;
//                } else {
//                    // the target is in the left part so we discard the right part
//                    right = mid - 1;
//                }
//            } else {
//                //The right side is sorted
//                if (target < nums[mid] || target > nums[right]) {
//                    //The target is not in the right side
//                    right = mid - 1;
//                } else {
//                    //The target is in the right side
//                    left = mid + 1;
//                }
//            }
//        }
//
//        return false;
//    }

        public static int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while (left <= right) {
            int mid = left + (right-left)/2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                //The left side is sorted:
                if (target >= nums[left] && target <= nums[mid]) {
                    //It is in the left side:
                    right = mid-1;
                } else {
                    //It's in the right side
                    left = mid+1;
                }
            } else {
                //The right side is sorted
                if (target >= nums[mid] && target <= nums[right]) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }

        return -1;
    }


}
