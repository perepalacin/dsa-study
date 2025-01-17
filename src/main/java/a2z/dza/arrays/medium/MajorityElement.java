// https://leetcode.com/problems/majority-element/submissions/1510981369/
package a2z.dza.arrays.medium;

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (frequencies.containsKey(nums[i])) {
                int freq = frequencies.get(nums[i]);
                frequencies.put(nums[i],++freq);
            } else {
                frequencies.put(nums[i], 1);
            }
        }

        int max = 0;
        int value = 0;
        for (int i : frequencies.keySet()) {
            if (frequencies.get(i) > max) {
                max = frequencies.get(i);
                value = i;
            }
        }
        return value;
    }

//    Alternative O(n) solution!
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        return nums[n/2]; -> it will always be there lol
//    }
}
