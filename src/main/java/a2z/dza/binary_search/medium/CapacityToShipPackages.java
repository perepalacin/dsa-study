// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
package a2z.dza.binary_search.medium;

public class CapacityToShipPackages {
    public static int shipWithinDays(int[] weights, int days) {
        int minWeight = 0, maxWeight = 0;

        for (int weight : weights) {
            maxWeight+=weight;
            minWeight = Math.max(minWeight, weight);
        }

        while (minWeight <= maxWeight) {
            int midWeight = (maxWeight+minWeight)/2;
            int carriedWeight = 0, numOfDays = 1;

            for (int weight : weights) {
                if (carriedWeight + weight > midWeight) {
                    numOfDays++;
                    carriedWeight = 0;
                }
                carriedWeight += weight;
            }


            if (numOfDays > days) {
                minWeight = midWeight+1;
            } else {
                maxWeight = midWeight-1;
            }

        }

        return minWeight;
    }
}
