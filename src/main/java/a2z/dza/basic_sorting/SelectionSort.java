// https://www.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort
package a2z.dza.basic_sorting;

public class SelectionSort {

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int posOfMin = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[posOfMin]) {
                    posOfMin = j;
                }
            }
            if (posOfMin != i) {
                int temp = arr[i];
                arr[i] = arr[posOfMin];
                arr[posOfMin] = temp;
            }
        }
        return arr;
    }
}
