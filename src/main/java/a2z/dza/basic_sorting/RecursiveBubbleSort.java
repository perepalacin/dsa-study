// https://www.geeksforgeeks.org/problems/bubble-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bubble-sort
package a2z.dza.basic_sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {

    public static int swapRecursively (int[]arr, int left){
        int swaps = 0;
        if (left >= arr.length-1) {
            return swaps;
        }

        if (arr[left] > arr[left+1]) {
            int temp = arr[left];
            arr[left] = arr[left+1];
            arr[left+1] = temp;
            swaps++;
        }

        swaps += swapRecursively(arr, ++left);

        return swaps;
    }

    public static int[] sort(int[] arr) {
        int swaps = swapRecursively(arr, 0);
        if (swaps > 0) {
            sort(arr);
        }

        return arr;
    }

}
