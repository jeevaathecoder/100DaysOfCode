package Day7;
//https://leetcode.com/problems/rotate-image/
//48. Rotate Image
import java.util.Arrays;

public class RotateArrayBy90Degree {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(arr);
    }

    public static void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                swap(matrix,i,j);
            }
        }


        for(int i=0;i<matrix.length; i++){
            int a=0;
            int b=matrix.length;
            while(a<b){
                hello(matrix,i,a,b);
                a++;
                b--;
            }
        }

        System.out.println(Arrays.toString(matrix));

    }

    public static void swap(int[][] matrix, int i , int j){
        int temp=matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i]=temp;
    }
    public static void hello(int[][] matrix,int i, int a , int b){
        int temp=matrix[i][a];
        matrix[i][a] = matrix[i][b];
        matrix[i][b]=temp;
    }
}
