// https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-occurrence
package a2z.dza.binary_search.easy;

public class CountNumberOfOcurrencesInSortedArray {
    public static int countFreq(int[] arr, int target) {
        if (arr.length == 1 && arr[0] == target) {
            return 1;
        }
        int index = binarySearch(arr, 0, arr.length-1, target);
        if (index == -1) {
            return 0;
        }
        int leftIndex = index;
        for (; leftIndex >= 0; leftIndex--) {
            if (arr[leftIndex] != target) {
                break;
            }
        }
        leftIndex++;
        int rightIndex = index;
        for (; rightIndex < arr.length; rightIndex++) {
            if (arr[rightIndex] != target) {
                break;
            }
        }
        rightIndex--;
        return rightIndex - leftIndex + 1;
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
