package Day104;
//https://leetcode.com/problems/maximal-rectangle/?envType=daily-question&envId=2024-04-13
//85. Maximal Rectangle
public class MaximalRectangle {
    class Solution {
        public int maximalRectangle(char[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
                return 0;

            int rows = matrix.length;
            int cols = matrix[0].length;
            int[] heights = new int[cols + 1];
            int maxArea = 0;

            for (char[] row : matrix) {
                for (int i = 0; i < cols; i++) {
                    heights[i] = (row[i] == '1') ? heights[i] + 1 : 0;
                }


                int n = heights.length;

                for (int i = 0; i < n; i++) {
                    for (int j = i, minHeight = Integer.MAX_VALUE; j < n; j++) {
                        minHeight = Math.min(minHeight, heights[j]);
                        int area = minHeight * (j - i + 1);
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }

            return maxArea;
        }
    }
}
