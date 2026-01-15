public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l = 1, r = piles[piles.length - 1];
        int res = r;

        while (l <= r) {
            int rate = l + ((r - l) / 2);
            double totalHours = 0;

            for (int pile : piles) {
                totalHours += ((pile + rate - 1) / rate);
            }

            if (totalHours > h) {
                l = rate + 1;
            } else {
                res = rate;
                r = rate -1;
            }
        }
        return res;
    }
}