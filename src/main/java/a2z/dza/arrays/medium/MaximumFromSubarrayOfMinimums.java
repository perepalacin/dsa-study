// https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays
package a2z.dza.arrays.medium;

public class MaximumFromSubarrayOfMinimums {
    public static int pairWithMaxSum(int arr[]) {
//        // Brute force approach (TLE)
//        int maxSum = 0;
//        int smallest = 0;
//        int secondSmallest = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] >= arr[i-1]) {
//                smallest = arr[i-1];
//                secondSmallest = arr[i];
//            } else {
//                secondSmallest = arr[i-1];
//                smallest = arr[i];
//            }
//            if (smallest + secondSmallest > maxSum) {
//                maxSum = smallest+secondSmallest;
//            }
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j] <= smallest) {
//                    secondSmallest = smallest;
//                    smallest = arr[j];
//                    if (smallest + secondSmallest > maxSum) {
//                        maxSum = smallest+secondSmallest;
//                    }
//                }
//            }
//        }
//        return maxSum;

        //Kandane's Algorithm!
        int maxSum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] + arr[i-1] > maxSum) {
                maxSum = arr[i] + arr[i-1];
            }
        }
        return maxSum;
    }
}
