package Day110;
//200. Number of Islands
//https://leetcode.com/problems/number-of-islands/?envType=daily-question&envId=2024-04-19
public class NumberOfIslands {
    class Solution {
        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }

            int numIslands = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        numIslands++;
                        dfs(grid, i, j);
                    }
                }
            }

            return numIslands;
        }

        private void dfs(char[][] grid, int i, int j) {
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {
                return;
            }

            grid[i][j] = '0'; // mark as visited
            dfs(grid, i + 1, j); // down
            dfs(grid, i - 1, j); // up
            dfs(grid, i, j + 1); // right
            dfs(grid, i, j - 1); // left
        }
    }
}
