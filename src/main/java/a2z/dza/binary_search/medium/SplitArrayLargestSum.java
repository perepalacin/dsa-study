// https://leetcode.com/problems/split-array-largest-sum/submissions/1549815249/
package a2z.dza.binary_search.medium;

public class SplitArrayLargestSum {

    public static int splitArray(int[] nums, int k) {

        int maxNum = -1, sum = 0;
        for (int i : nums) {
            maxNum = Math.max(maxNum, i);
            sum += i;
        }

        int low = maxNum, high = sum;

        int lowestResult = sum;

        while (low <= high) {
            int mid = (high+low)/2;
            int count = 0, arrays = 1;

            for (int i : nums) {
                if (count + i > mid) {
                    arrays++;
                    count = 0;
                }
                count += i;
            }

            if (arrays > k) {
                low = mid +1;
            } else {
                high = mid -1;
                lowestResult = mid;
            }
        }

        return lowestResult;
    }

}
