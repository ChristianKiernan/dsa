public class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int l = 0, r = l + 1;

        while (r < prices.length) {
            if (prices[l] >= prices[r]) {
                l = r;
                r ++;
            } else {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
                r ++;
            }
        }
        return maxP;
    }
}