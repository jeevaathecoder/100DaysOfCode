package Day134;

//861. Score After Flipping Matrix
//https://leetcode.com/problems/score-after-flipping-matrix/description/

public class ScoreAfterFlippingMatrix {
    class Solution {
        public  boolean shouldRowFlip(int[][] grid, int row) {
            return grid[row][0] == 0;
        }

        public  void flipRow(int[][] grid, int row, int colSize) {
            for (int i = 0; i < colSize; i++) {
                grid[row][i] ^= 1;
            }
        }

        public  boolean sholdColumuFlip(int[][] grid, int col,int  rowSize) {
            int one = 0, zero = 0;

            for (int i = 0; i < rowSize; i++) {
                if (grid[i][col] == 0) {
                    zero++;
                } else {
                    one++;
                }
            }

            return zero > one;
        }

        public  void flipColumu(int[][] grid, int col, int rowSize) {
            for (int i = 0; i < rowSize; i++) {
                grid[i][col] ^= 1;
            }
        }

        public  int totalOnes(int[][] grid, int rowSize, int colSize) {
            int total = 0;

            for (int i = 0; i < rowSize; i++) {
                int curr = 0, pow = 1;

                for (int j = colSize - 1; j >= 0; j--) {
                    curr += (pow * grid[i][j]);
                    pow *= 2;
                }

                total += curr;
            }

            return total;
        }

        public int matrixScore(int[][] grid) {
            int rowSize = grid.length, colSize = grid[0].length;

            for (int i = 0; i < rowSize; i++) {
                if (shouldRowFlip(grid, i)) {
                    flipRow(grid, i, colSize);
                }
            }

            for (int i = 0; i < colSize; i++) {
                if (sholdColumuFlip(grid, i, rowSize)) {
                    flipColumu(grid, i, rowSize);
                }
            }

            return totalOnes(grid, rowSize, colSize);
        }
    }
}
