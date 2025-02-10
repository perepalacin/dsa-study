// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
package a2z.dza.binary_search.medium;

public class FindSmallestDivisorGivenAThreshold {
    public static int smallestDivisor(int[] nums, int threshold) {
        int left =1, right = 0;
        for (int num: nums) {
            right = Math.max(right, num);
        }
        while (left <= right) {
            int sum = 0, mid = (left+right)/2;
            for (int num : nums) {
                sum += Math.ceilDiv(num, mid);
            }
            if (sum > threshold) {
                left = mid+1;
            } else {
                right = mid -1;
            }
        }
        return right+1;
    }
}
