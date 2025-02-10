// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
package a2z.dza.binary_search.medium;

public class MinimumDayForBouquets {
    public static int minDays(int[] bloomDay, int m, int k) {
        int left = 1, right = 0;
        int flowers = 0;
        for (int day : bloomDay) {
            right = Math.max(right, day);
            flowers++;
        }

        if (((long)m * k) > flowers) return -1;

        while (left <= right) {
            int mid = (left+right)/2;
            int bouquetsLeft = m;
            int flowersForBouket = k;
            for (int i = 0; i < bloomDay.length; i++) {
                if (mid >= bloomDay[i]) {
                    flowersForBouket--;
                    if (flowersForBouket == 0) {
                        bouquetsLeft--;
                        flowersForBouket = k;
                    }
                } else {
                    flowersForBouket = k;
                }
            }

            if (bouquetsLeft > 0) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return right +1;
    }
}
