package Day4;

//https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399
// Longest Subarray With Sum K
public class SubArrayWithLargestSum {

    public static int longestSubarrayWithSumK(int []a, long k) {

        int left=0;
        int right=0;
        long sum=a[0];
        int maxLen=0;
        int n=a.length;
        while(right<n){

            while(left<=right && sum>k){
                sum=sum - a[left];
                left++;
            }
            if(sum==k){
                maxLen = Math.max(maxLen, right-left+1);
            }

            right++;
            if(right<n){
                sum = sum +a[right];
            }
        }
        return maxLen;
    }
}
