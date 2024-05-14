package Day135;
//1219. Path with Maximum Gold
//https://leetcode.com/problems/path-with-maximum-gold/description/

public class PathWithMaximumGold {
    class Solution {
        public int getMaximumGold(int[][] grid) {
            if(grid == null || grid.length==0) return 0;

            int max=0,  m=grid.length, n=grid[0].length;

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){

                    if(grid[i][j]>0){
                        int gold = findMaxGold(grid,i,j,m,n, new boolean[m][n]);
                        max=Math.max(max,gold);
                    }
                }
            }
            return max;
        }
        private int findMaxGold(int[][] grid, int i, int j, int m, int n, boolean[][] visited) {
            if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0 || visited[i][j]) return 0;

            visited[i][j] = true;

            int left = findMaxGold(grid, i, j - 1, m, n, visited);
            int right = findMaxGold(grid, i, j + 1, m, n, visited);
            int up = findMaxGold(grid, i - 1, j, m, n, visited);
            int down = findMaxGold(grid, i + 1, j, m, n, visited);

            visited[i][j] = false;
            return grid[i][j] + Math.max(left, Math.max(right, Math.max(up, down)));
        }
    }
}
