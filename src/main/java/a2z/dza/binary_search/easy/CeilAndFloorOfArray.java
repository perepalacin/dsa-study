// https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
package a2z.dza.binary_search.easy;

import a2z.dza.basic_sorting.BubbleSort;

import java.util.Arrays;

public class CeilAndFloorOfArray {
    public static int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        return findIndexes(arr, 0, arr.length-1, x, new int[]{-1,-1});
    }

    public static int[] findIndexes(int[] arr, int left, int right, int target, int[] indexes) {
        if (left > right) {
            return indexes;
        }

        int index = left + (right - left) / 2;
        if (arr[index] == target) {
            return new int[]{index, index};
        } else if (arr[index] > target ){
            indexes[1] = index;
            return findIndexes(arr, left, index-1, target, indexes);
        } else {
            indexes[0] = index;
            return findIndexes(arr, index+1, right, target, indexes);
        }
    }
}
