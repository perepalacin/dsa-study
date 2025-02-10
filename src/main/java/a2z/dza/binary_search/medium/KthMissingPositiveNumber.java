// https://leetcode.com/problems/kth-missing-positive-number/description/
package a2z.dza.binary_search.medium;

public class KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
//        // Brute force approach:
//        int leftIndexes = k;
//        int missingIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != missingIndex + 1) {
//                while (missingIndex < arr[i] - 1) {
//                    leftIndexes--;
//                    missingIndex++;
//                    if (leftIndexes == 0) {
//                        return missingIndex;
//                    }
//                }
//            }
//            missingIndex = arr[i];
//        }
//        return missingIndex+leftIndexes;
        // Binary Search Approach:
        int low = 0, high = arr.length-1;
        while (low <= high) {
            int mid = (high+low)/2;
            if (arr[mid] - (mid + 1) < k) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return high+k+1;
    }
}
