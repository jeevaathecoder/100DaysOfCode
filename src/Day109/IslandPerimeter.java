package Day109;
//463. Island Perimeter
//https://leetcode.com/problems/island-perimeter/
public class IslandPerimeter {
    class Solution {
        public int islandPerimeter(int[][] grid) {
            int row=grid.length;
            int col= grid[0].length;

            if(row == 0 || col == 0) return 0;

            int result=0;

            for(int i=0;i<row; i++){
                for(int j=0;j<col; j++){
                    if(grid[i][j] == 1){
                        result+=4;

                        if(j>0 && grid[i][j-1] == 1){
                            result-=2;
                        }
                        if(i>0 && grid[i-1][j] == 1){
                            result-=2;
                        }
                    }
                }
            }
            return result;
        }
    }
}
