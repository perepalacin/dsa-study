// https://www.naukri.com/code360/problems/painter-s-partition-problem_1089557?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
package a2z.dza.binary_search.medium;

import java.util.ArrayList;

public class FindLargestMinDistance {

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {

        int maxLog = -1, sum = 0;

        for (int i : boards) {
            maxLog = Math.max(maxLog, i);
            sum += i;
        }

        int low = maxLog, high = sum;

        int minDistance = sum;

        while (low <= high) {
            int mid = (high+low)/2;

            int chopers = 1;
            int distanceDone = 0;

            for (int i : boards) {
                if (distanceDone + i > mid) {
                    chopers++;
                    distanceDone = 0;
                }
                distanceDone += i;
            }



            if (chopers > k) {
                low = mid+1;
            } else {
                high = mid-1;
                minDistance = mid;
            }
        }

        return minDistance;

    }
}
