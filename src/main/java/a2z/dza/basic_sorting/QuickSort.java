// https://www.geeksforgeeks.org/problems/quick-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-sort
// This video explains the algorithm really well: https://www.youtube.com/watch?v=Vtckgz38QHs
package a2z.dza.basic_sorting;

public class QuickSort {
    public static void quickSort(int arr[], int low, int high) {
        //First iteration low = 0; high = arr.len -1;
        if (low > high) {
            return;
        }

        //this is recursive -> we find the pivot for this iteration, then call quicksort again on the items before and after the pivot!
        //Since the items before the found pivot are smaller than it, and the ones before are bigger.
        int pivot = partition(arr, low, high);

        quickSort(arr, low, pivot -1);
        quickSort(arr, pivot + 1, high);
    }

    public static int partition(int arr[], int low, int high) {
        //We need to find the position of the pivot -> We start with the last one
        int pivot = arr[high];

        //we set i to be the j-1; and j = low;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            //if we find a number smaller than the pivot, we increase i and swap i with j, as it should go before the pivot
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //once we have iterated over all the items in the array, we place the pivot where it belongs and we return the position of the pivot!
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
}
