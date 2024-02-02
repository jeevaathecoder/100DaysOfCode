package Day25;
//https://www.codingninjas.com/studio/problems/median-of-a-row-wise-sorted-matrix_1115473?
//Median in a row-wise sorted Matrix
public class MedianIn2DArray {

    public static int upperBound(int arr[], int n, int x){

        int low=0;

        int high=n-1;

        int ans=n;

        while(low<=high){

            int mid=(low+high)/2;

            if(arr[mid]>x){

                ans=mid;

                high=mid-1;

            }

            else low=mid+1;

        }

        return ans;

    }


    public static int countSmallEqual(int matrix[][],int m, int n, int x){

        int cnt=0;

        for(int i=0; i<n; i++){

            cnt+=upperBound(matrix[i],m,x);

        }

        return cnt;

    }

    public static int findMedian(int matrix[][], int m, int n) {

        // Write your code here

        int low= Integer.MAX_VALUE;

        int high=Integer.MIN_VALUE;

        n=matrix.length;

        m=matrix[0].length;

        for(int i=0; i<n; i++){

            low=Math.min(low,matrix[i][0]);

            high=Math.max(high,matrix[i][m-1]);

        }

        int required=(n*m)/2;

        while(low<=high){

            int mid=(low+high)/2;

            int smallEqual = countSmallEqual(matrix,m,n,mid);

            if(smallEqual <= required) low=mid+1;

            else high=mid-1;

        }

        return low;

    }
}
