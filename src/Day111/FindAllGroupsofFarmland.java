package Day111;
//1992. Find All Groups of Farmland
//https://leetcode.com/problems/find-all-groups-of-farmland/
import java.util.ArrayList;

public class FindAllGroupsofFarmland {
    class Solution {
        int endRow = 0, endCol = 0;
        int row, col;

        public int[][] findFarmland(int[][] land) {
            row = land.length;
            col = land[0].length;
            ArrayList<int[]> list = new ArrayList<>();

            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    if(land[i][j] == 1){

                        dfs(land, i, j);

                        list.add(new int[]{i, j, endRow, endCol});


                        endRow = 0;
                        endCol = 0;
                    }
                }
            }


            int arr[][] = new int[list.size()][4];
            for(int i = 0; i<arr.length; i++)arr[i] = list.get(i);
            return arr;


        }

        public void dfs(int[][] land, int i, int j){

            if(i<0 || j<0 || i>=row || j>=col || land[i][j] == 0)return;

            land[i][j] = 0;

            dfs(land, i+1, j);

            dfs(land, i, j+1);


            endRow = Math.max(endRow, i);
            endCol = Math.max(endCol, j);
        }
    }
}
