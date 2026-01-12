public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lVert = 0;
        int rVert = matrix.length -1;

        while (lVert <= rVert ) {
            int midArrIdx = lVert + ((rVert - lVert) / 2);

            int lHorizontal = 0;
            int rHorizontal = matrix[midArrIdx].length -1;

            while(lHorizontal <= rHorizontal) {
                int mid = lHorizontal + ((rHorizontal - lHorizontal) / 2);
                if (matrix[midArrIdx][mid] == target) {
                    return true;
                } else if (matrix[midArrIdx][mid] > target) {
                    rHorizontal = mid - 1;
                } else {
                    lHorizontal = mid + 1;
                }
            }

            if (matrix[midArrIdx][0] > target) {
                rVert = midArrIdx - 1;
            } else {
                lVert = midArrIdx + 1;
            }
        }
        return false;
    }
}