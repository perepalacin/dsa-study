// https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=inversion-of-array
package a2z.dza.arrays.hard;

import java.util.ArrayList;
import java.util.HashMap;

public class CountInversions {
    public static int inversionCount(int arr[]) {

//        //O(n) time o(1) memory approach, TLE
//        int result = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i+1; j <arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    result++;
//                }
//            }
//        }
//        return result;

        // O(nlogn) time and O(n) space approach:
        return sort(arr, 0, arr.length - 1);
    }

    private static int sort(int[] arr, int l, int r) {
        int inversions = 0;
        if (l < r) {
            int mid = l + (r - l) / 2;
            inversions += sort(arr, l, mid);
            inversions += sort(arr, mid + 1, r);
            inversions += mergeAndCount(arr, l, mid, r);
        }
        return inversions;
    }

    private static int mergeAndCount(int[] arr, int l, int mid, int r) {
        int[] left = new int[mid - l + 1];
        int[] right = new int[r - mid];
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = l, inversions = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                inversions += (mid + 1) - (l + i);
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
        return inversions;
    }
}
