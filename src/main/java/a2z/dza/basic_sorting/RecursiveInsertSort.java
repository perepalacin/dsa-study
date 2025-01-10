package a2z.dza.basic_sorting;

public class RecursiveInsertSort {

    public static void insertSort(int[] arr, int i, int next) {
        if (i >= 0 && i < arr.length-1) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            insertSort(arr, --i, next);
            insertSort(arr, next, ++next);
        }
    }

    public static int[] sort(int[] arr) {
        insertSort(arr, 0, 1);
        return arr;
    }
}
