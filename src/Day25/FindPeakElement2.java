package Day25;
//1901. Find a Peak Element II
public class FindPeakElement2 {
    public int findMaxIndex(int[][] mat,int mid,int n) {
        int maxi = -1;
        int ind = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][mid] > maxi) {
                maxi = mat[i][mid];
                ind = i;
            }
        }
        return ind;
    }



    public int[] findPeakGrid(int[][] mat) {
        int ans[] = {-1,-1};
        int n = mat.length;
        int m = mat[0].length;
        int low =0;
        int high = m-1;

        while(low<=high){
            int mid =(low+high)/2;
            int index = findMaxIndex(mat,mid,n);
            int left = mid-1>=0 ? mat[index][mid-1]:-1;
            int right = mid+1<m ? mat[index][mid+1]:-1;

            if(mat[index][mid]>left && mat[index][mid]>right){
                return new int[]{index, mid};
            }

            else if (mat[index][mid]<left){
                high =mid-1;
            }

            else{
                low =mid+1;
            }
        }
        return new int[]{-1, -1};
    }
}
