// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k
package a2z.dza.arrays.easy;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
        // code here
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> previousSums = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (previousSums.containsKey(sum-k)) {
                if ( (i - previousSums.get(sum-k)+1) > maxLength) {
                    maxLength = i - previousSums.get(sum-k);
                }
            }
            if (!previousSums.containsKey(sum)) {
                previousSums.put(sum, i);
            }

            if (sum == k) {
                if ( (i + 1) > maxLength) {
                    maxLength = i + 1;
                }
            }

        }
        return maxLength;
    }
}
