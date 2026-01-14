public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r) {
            int consumptionRate = (l + r) / 2;
            long numHours = 0;

            for (int i = 0; i < piles.length; i ++) {
                numHours += ((piles[i] + consumptionRate - 1) / consumptionRate);
            }

            if (numHours > h) {
                l = consumptionRate + 1;
            } else {
                res = consumptionRate;
                r = consumptionRate - 1;
            }
        }
        return res;
    }
}
