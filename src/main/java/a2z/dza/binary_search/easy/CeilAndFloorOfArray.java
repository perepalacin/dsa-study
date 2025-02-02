// https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
package a2z.dza.binary_search.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class CeilAndFloorOfArray {
    public static int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> nums = new ArrayList<>();
        int numsIndex = 0;
        nums.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != nums.get(numsIndex)) {
                nums.add(arr[i]);
                numsIndex++;
            }
        }

        return findIndexes(nums, 0, nums.size() - 1, x, new int[]{-1,-1});
    }

    public static int[] findIndexes(ArrayList<Integer> arr, int left, int right, int target, int[] indexes) {
        if (left > right) {
            return indexes;
        }

        int index = left + (right - left) / 2;
        if (arr.get(index) == target) {
            return new int[]{target, target};
        } else if (arr.get(index) > target ){
            indexes[1] = arr.get(index);
            return findIndexes(arr, left, index-1, target, indexes);
        } else {
            indexes[0] = arr.get(index);
            return findIndexes(arr, index+1, right, target, indexes);
        }
    }
}
