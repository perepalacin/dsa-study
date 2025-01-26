// https://leetcode.com/problems/merge-intervals/description/
package a2z.dza.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        //BRUTE FORCE APPROACH
        // this solution is very slow because of how i treat the solution array, it can be made much faster if we create a list of int[] instead of list of lists:
//        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
//
//        List<List<Integer>> result = new ArrayList<>();
//
//        result.add(Stream.of(intervals[0][0], intervals[0][1]).toList());
//
//        for (int i = 1; i < intervals.length; i++) {
//            boolean found = false;
//            for (int j = 0; j < result.size(); j++) {
//                if (intervals[i][0] >= result.get(j).getFirst() &&  intervals[i][0] <= result.get(j).getLast()) {
//                    result.set(j, Stream.of(result.get(j).getFirst(), Math.max(result.get(j).getLast(), intervals[i][1])).toList());
//                    found = true;
//                }
//            }
//            if (!found) {
//                result.add(Stream.of(intervals[i][0], intervals[i][1]).toList());
//            }
//        }
//
//
//        int[][] resultArray = new int[result.size()][2];
//
//        for (int i = 0; i < result.size(); i++) {
//            resultArray[i][0] = result.get(i).getFirst();
//            resultArray[i][1] = result.get(i).getLast();
//        }
//        return resultArray;

        // Faster approach
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                merged.add(prev);
                prev = interval;
            }
        }

        merged.add(prev);

        return merged.toArray(new int[merged.size()][]);
    }
}
