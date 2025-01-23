// https://leetcode.com/problems/majority-element-ii/description/
package a2z.dza.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
    public static List<Integer> majorityElement(int[] nums) {

//        // O(n) space appreach:
//        HashMap<Integer, Integer> frequencies = new HashMap<>();
//        for (int i : nums) {
//            frequencies.put(i, frequencies.getOrDefault(i, 0) +1);
//        }
//
//        List<Integer> result = new ArrayList<>();
//
//        for (int i : frequencies.keySet()) {
//            if (frequencies.get(i) > nums.length / 3) {
//                result.add(i);
//            }
//        }
//        return result;

        // O(1) space approach: We need to assume there are two majority elements!Boyer-Moore Voting Algorithm
        int firstMax = 0, secondMax = 0, countFirst = 0, countSecond = 0;

        for (int i : nums) {
            if (i == firstMax) {
                countFirst++;
            } else if (i == secondMax) {
                countSecond++;
            } else if (countFirst == 0) {
                firstMax = i;
                countFirst = 1;
            } else if (countSecond ==0 ) {
                secondMax = i;
                countSecond = 1;
            } else {
                countFirst--;
                countSecond--;
            }
        }

        countFirst = 0;
        countSecond = 0;

        for (int i : nums) {
            if (i == firstMax) {
                countFirst++;
            } else if (i == secondMax) {
                countSecond++;
            }
        }

        List<Integer> result = new ArrayList<>();

        if (countFirst > nums.length / 3) {
            result.add(firstMax);
        }
        if (countSecond > nums.length / 3) {
            result.add(secondMax);
        }

        return result;
    }
}
