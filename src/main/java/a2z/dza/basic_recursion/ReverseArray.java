package a2z.dza.basic_recursion;

public class ReverseArray {

    public static int[] mainFunction(int[] arr) {
        reverse(arr ,0 , arr.length-1);
        return arr;
    }

    public static void reverse(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            reverse(arr, ++leftIndex, --rightIndex);
        }
    }
}
