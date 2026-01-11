public class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int maxCapacity = 0;

        while (l < r) {
            int smallBar = Math.min(heights[l], heights[r]);
            int currCapacity = smallBar * (r - l);

            if (currCapacity > maxCapacity) {
                maxCapacity = currCapacity;
            }

            if (heights[l] == smallBar) {
                l ++;
            } else {
                r --;
            }
        }
        return maxCapacity;
    }
}