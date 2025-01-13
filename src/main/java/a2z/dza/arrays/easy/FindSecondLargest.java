// https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
package a2z.dza.arrays.easy;

public class FindSecondLargest {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int secondLargest = -1;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
