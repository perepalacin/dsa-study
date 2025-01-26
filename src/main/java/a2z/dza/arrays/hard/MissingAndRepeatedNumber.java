// https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-missing-and-repeating
package a2z.dza.arrays.hard;

import java.util.ArrayList;
import java.util.HashMap;

public class MissingAndRepeatedNumber {
    public static ArrayList<Integer> findTwoElement(int arr[]) {
        int sum = 0, expectedSum = 0;

        int mostFrequent = 0;
        HashMap<Integer, Integer> foundNumbers = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            expectedSum += i + 1;
            sum += arr[i];
            if (mostFrequent != 0 && !foundNumbers.containsKey(arr[i])){
                foundNumbers.put(arr[i], i);
            } else {
                mostFrequent = arr[i];
            }
        }

        int missingNumber = (expectedSum - sum) + mostFrequent;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(mostFrequent);
        result.add(missingNumber);
        return result;
    }
}
