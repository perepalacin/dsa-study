// https://leetcode.com/problems/frequency-of-the-most-frequent-element/
package a2z.dza.basic_hashing;

import java.util.*;

public class FrequencyOfTheMostFrequentElement {

    // My "incorrect" solution: It exceeds the time limit for test 58 where 10^15 numbers are provided
    // The proof is that this same code doesn't fail if done with Python where there is no int overflow
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        List<Long> frequencies = new ArrayList<>();
        frequencies.add(1L);
        for (int i = nums.length -1; i > 0; i--) {
            int indexes = k;
            long currentFreq = 1L;
            for (int j = i-1; j >= 0; j--) {
                int currentNumber = nums[j];
                while (currentNumber < nums[i] && indexes > 0) {
                    currentNumber++;
                    indexes--;
                }
                if (currentNumber == nums[i]) {
                    currentFreq++;
                }
                if (indexes == 0) {
                    break;
                }
            }
            frequencies.add(currentFreq);
        }
        return (int) (long) Collections.max(frequencies);
    }

//    ## Python code ##
//    class Solution(object):
//    def maxFrequency(self, nums, k):
//            nums.sort()
//            frequencies = [1]
//            for i in range(len(nums) - 1, 0, -1):
//              indexes = k
//              current_freq = 1
//              for j in range(i - 1, -1, -1):
//                  current_number = nums[j]
//                  while current_number < nums[i] and indexes > 0:
//                      current_number += 1
//                      indexes -= 1
//                      if current_number == nums[i]:
//                          current_freq += 1
//                      if indexes == 0:
//                          break
//                  frequencies.append(current_freq)
//            return max(frequencies)

//    A more optimized way would be to remove the iterations over every cell of the array to check if we have enough indexes (k) to add up to the previous number, and just calculate the difference between the previous number and the actual
//        public int maxFrequency(int[] nums, int k) {
//            long cost =0;
//            int j = 0;
//            int freq = 1;
//            Arrays.sort(nums);
//            for(int i =1; i<nums.length; i++){
//                cost += (long)(i-j)*(nums[i]-nums[i-1]);
//                while(cost>k){
//                    cost -= (nums[i]-nums[j]); // Here we calculate the cost. instead of iterating a second time! Would be much faster
//                    j+=1;
//
//                }
//                freq = Math.max(freq, i-j+1);
//            }
//            return freq;
//        }


}
