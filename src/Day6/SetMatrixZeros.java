package Day6;
//73. Set Matrix Zeroes
//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        int a=matrix.length;
        int b=matrix[0].length;

        int[] row = new int[a];
        int[] col = new int[b];

        for(int i=0;i<matrix.length ; i++){
            for(int j=0; j<matrix[i].length; j++)
            {
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0;i<row.length; i++){
            for(int j=0;j<col.length; j++){

                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] =0;
                }
            }
        }
    }
}
