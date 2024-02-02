package Day23;
//https://leetcode.com/problems/search-a-2d-matrix/
//74. Search a 2D Matrix
public class FindElementIn2D2 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int s=0;
        int m= matrix.length;
        int n= matrix[0].length;
        int e= (m*n)-1;

        while(s<=e){
            int mid= (s+e)/2;
            int row= mid /n;
            int col= mid % n;
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] < target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
}
