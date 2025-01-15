// https://leetcode.com/problems/missing-number/submissions/1509831728/
package a2z.dza.arrays.easy;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        long currentSum = 0L;
        long sum = 0L;
        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
            sum = sum + i+1;
        }
        return (int) (sum - currentSum);
    }
}
