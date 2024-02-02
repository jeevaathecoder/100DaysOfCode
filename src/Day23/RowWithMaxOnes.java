package Day23;

//https://www.codingninjas.com/studio/problems/row-of-a-matrix-with-maximum-ones_982768?
// Row with max 1s

import java.util.ArrayList;

public class RowWithMaxOnes {
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        int cnt_max = 0;
        int index = -1;


        for (int i = 0; i < n; i++) {

            int cnt_ones = m - lowerBound(matrix.get(i), m, 1);
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }

    public static int lowerBound(ArrayList<Integer> arr, int n,int x){
        int s=0;
        int e=n-1;
        int ans=n;
        while(s<=e){
            int mid = (s+e)/2;

            if(arr.get(mid)>=x){
                ans=mid;
                e=mid-1;

            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}
