package a2z.dza.arrays.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] arr) {
        Set<Integer> nums = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            nums.add(arr[i]);
        }

        int maxLen = 1;
        for (int i = 0; i < arr.length; i++) {
            if (nums.contains(arr[i]) && !nums.contains(arr[i]-1)) {
                int cur = arr[i];
                int len = 0;
                while (nums.contains(cur)) {
                    cur++;
                    len++;
                }
                if (len > maxLen) {
                    maxLen = len;
                }
            }
        }
        return maxLen;
    }
}
