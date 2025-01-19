// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=leaders-in-an-array
package a2z.dza.arrays.medium;

import java.util.ArrayList;

public class ArrayLeaders {
    public static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[arr.length-1];
        result.add(max);
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                result.addFirst(max);
            }
        }
        return result;
    }
}
