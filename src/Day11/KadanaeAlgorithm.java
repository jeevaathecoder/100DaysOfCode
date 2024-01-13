package Day11;
//Kadane's Algorithm
//https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
public class KadanaeAlgorithm {
    long maxSubarraySum(int arr[], int n){
        if(n==1)
        { return arr[0];}
        long maxSum=Integer.MIN_VALUE;
        long currSum= 0;

        for(int i=0 ; i< n ;i++){
            currSum+= arr[i];
            maxSum=Math.max(currSum, maxSum);
            if(currSum<0){
                currSum=0;
            }
        }

        return maxSum;

    }
}
