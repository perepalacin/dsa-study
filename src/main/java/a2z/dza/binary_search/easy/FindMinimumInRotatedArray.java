// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
package a2z.dza.binary_search.easy;

public class FindMinimumInRotatedArray {

    public static int findMin(int []arr) {
        int left = 0, right = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = (left + right) / 2;

            //if left part is sorted:
            if (arr[left] <= arr[mid]) {
                // keep the minimum:
                ans = Math.min(ans, arr[left]);

                // Eliminate left half:
                left = mid + 1;

            } else { //if right part is sorted:

                // keep the minimum:
                ans = Math.min(ans, arr[mid]);

                right = mid - 1;
            }
        }
        return ans;
    }

}
