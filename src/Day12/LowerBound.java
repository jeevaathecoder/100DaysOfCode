package Day12;

// Implement Lower Bound
//https://www.codingninjas.com/studio/problems/lower-bound_8165382
public class LowerBound {
    public static int lowerBound(int []arr, int n, int x) {

        int s=0;
        int e=n-1;
        int ans=n;
        while(s<=e){
            int mid=(s+e)/2;

            if(arr[mid]>=x){
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
