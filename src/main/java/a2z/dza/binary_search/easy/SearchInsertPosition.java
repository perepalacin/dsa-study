// https://leetcode.com/problems/search-insert-position/description/
package a2z.dza.binary_search.easy;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        return lowerBound(nums, 0, nums.length-1, target, -1);
    }

    public static int lowerBound(int[] nums, int left, int right, int target, int position) {
        if (left > right) {
            return position+1;
        }

        int index = left + (right-left)/2;

        if (nums[index] == target) {
            return index;
        } else if (nums[index] > target ){
            return lowerBound(nums, left, index-1, target, position);
        } else {
            return lowerBound(nums, index+1, right, target, index);
        }
    }

}
