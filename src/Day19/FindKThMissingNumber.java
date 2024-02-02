package Day19;

//https://leetcode.com/problems/kth-missing-positive-number/
//1539. Kth Missing Positive Number
public class FindKThMissingNumber {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int s=0;
        int e=n-1;

        while(s<=e){
            int mid = (s+e)/2;

            int missing = arr[mid] - (mid+1);

            if(missing<k){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        int need=e + k +1 ;
        return need;
    }
}
