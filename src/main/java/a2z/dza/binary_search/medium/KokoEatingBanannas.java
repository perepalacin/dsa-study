// https://leetcode.com/problems/koko-eating-bananas/
package a2z.dza.binary_search.medium;

import java.util.Arrays;
import java.util.OptionalInt;

public class KokoEatingBanannas {

    public static int minEatingSpeed(int[] piles, int h) {
//        // Brute forcing: Exceeds Time Limit!
//        int minSpeed = 1;
//
//        while (1 < 2) {
//            int leftHours = h;
//            for (int i = 0; i < piles.length; i++) {
//                int eatenBananas = 0;
//                while (eatenBananas < piles[i]) {
//                    eatenBananas += minSpeed;
//                    leftHours--;
//                }
//                if (leftHours >= 0 && i == piles.length - 1) {
//                    return minSpeed;
//                }
//            }
//            minSpeed++;
//        }

        // Let's apply binary search to the answer space which is between 1 and Max(piles[i])
        int right = 0;
        for (int pile : piles) {
            right = Math.max(pile, right);
        }

        int left = 1;

        while (left <= right) {
            int mid = (left+right)/2;
            int leftHours = h;
//            for (int pile : piles) {
//                int eatenBananas = 0;
//                while (eatenBananas < pile) {
//                    eatenBananas += mid;
//                    leftHours--;
//                }
//            }
            for (int pile : piles) {
                int hours = Math.ceilDiv ( pile , mid );
                leftHours-=hours;
            }

            if (leftHours >= 0) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }

        return right+1;
    }
}
