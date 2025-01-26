// https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?category%5B%5D=Hash&company%5B%5D=Amazon&page=1&query=category%5B%5DHashcompany%5B%5DAmazonpage1company%5B%5DAmazoncategory%5B%5DHash&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-subarray-with-0-sum
package a2z.dza.arrays.hard;

import java.util.HashMap;

public class SubarrayWithSumZero {
    public static int maxLen(int arr[]) {
        int result = 0;
        int sum = 0;
        HashMap<Integer, Integer> prefixSums = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (arr[i] == 0) {
                result = Math.max(result, 1);
            }
            if (sum == 0) {
                result = Math.max(result, i + 1);
            }

            if (prefixSums.containsKey(sum)) {
                result = Math.max(result, i - prefixSums.get(sum));
            }

            if (!prefixSums.containsKey(sum)) {
                prefixSums.put(sum, i);
            }
        }

        return result;
    }
}
