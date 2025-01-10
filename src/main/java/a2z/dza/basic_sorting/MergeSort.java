package a2z.dza.basic_sorting;

public class MergeSort {

    public static int[] sort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            int[] left = new int[mid - l + 1];
            int[] right = new int[r - mid];

            for (int i = 0; i < left.length; i++) {
                left[i] = arr[l + i];
            }
            for (int i = 0; i < right.length; i++) {
                right[i] = arr[mid + 1 + i];
            }

            left = sort(left, 0, left.length - 1);
            right = sort(right, 0, right.length - 1);
            return merge(left, right);
        }
        return arr;
    }

    public static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int index = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] >= right[rightIndex]) {
                result[index] = right[rightIndex];
                rightIndex++;
            } else {
                result[index] = left[leftIndex];
                leftIndex++;
            }
            index++;
        }
        for (int i = rightIndex; i < right.length; i++) {
            result[index] = right[i];
            index++;
        }

        for (int i = leftIndex; i < left.length; i++) {
            result[index] = left[i];
            index++;
        }
        return result;
    }
}
