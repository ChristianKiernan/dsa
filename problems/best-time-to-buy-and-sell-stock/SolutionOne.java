public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;

        int l = 0, r = l + 1;
        int maxProfit = 0;

        while (r < prices.length) {
            if (prices[l] > prices[r]) {
                l = r; r ++;
            } else {
                int profit = prices[r] - prices[l];

                if (profit > maxProfit) {
                    maxProfit = profit;
                }

                r ++;
            }
        }
        return maxProfit;
    }
}