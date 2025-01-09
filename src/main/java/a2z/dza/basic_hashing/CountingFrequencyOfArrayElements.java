// https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0
package a2z.dza.basic_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountingFrequencyOfArrayElements {
    public static List<Integer> frequencyCount(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i : arr) {
            if (map.containsKey(i)){
                int value = map.get(i);
                map.put(i, ++value);
            } else {
                map.put(i, 1);
            }
        }

        for (int i = 1; i <= arr.length; i++) {
            result.add(map.getOrDefault(i, 0));
        }
        return result;
    }
}
