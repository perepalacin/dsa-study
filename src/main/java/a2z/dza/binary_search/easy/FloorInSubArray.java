// https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
package a2z.dza.binary_search.easy;

public class FloorInSubArray {
    public static int findFloor(int[] arr, int k) {
        return findIndex(arr, 0, arr.length-1, k, -1);
    }

    public static int findIndex(int[] arr, int left, int right, int target, int x) {
        if (left > right) {
            return x;
        }

        int index = left + (right - left) / 2;
        if (arr[index] == target) {
            return index;
        } else if (arr[index] > target ){
            return findIndex(arr, left, index-1, target, x);
        } else {
            return findIndex(arr, index+1, right, target, index);
        }
    }
}
