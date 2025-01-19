// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
package a2z.dza.arrays.medium;

import java.util.HashMap;

public class BestTimeToBuyAndSell {
    public static int maxProfit(int[] prices) {
//        // Brute force approach
//        int maxProfix = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i; j < prices.length; j++) {
//                if (prices[j] - prices[i] > maxProfix) {
//                    maxProfix = prices[j] - prices[i];
//                }
//            }
//        }
//        return  maxProfix;

//        // O(N) approach with O(N) memory
//        HashMap<Integer, Integer> costs = new HashMap<>();
//        int min = 10001;
//        for (int i = 0; i < prices.length -1; i++) {
//            if (min >= prices[i]){
//                min = prices[i];
//            }
//            costs.put(i + 1, min);
//        }
//        int maxProfix = 0;
//        for (int i = 1; i < prices.length; i++) {
//            if (maxProfix < prices[i] - costs.get(i)) {
//                maxProfix = prices[i] - costs.get(i);
//            }
//        }
//        return maxProfix;

        // Kadane like approach
        int maxProfit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - buy > maxProfit) {
                maxProfit = prices[i] - buy;
            }
            if (buy > prices[i]) {
                buy = prices[i];
            }
        }
        return maxProfit;
    }
}
