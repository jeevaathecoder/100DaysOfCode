package Day9;

import java.util.HashMap;

// Longest Subarray With Zero Sum
//https://www.codingninjas.com/studio/problems/longest-subarray-with-zero-sum_6783450?
public class SubArrayWithSum0 {
    public static int getLongestZeroSumSubarrayLength(int []arr){

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int maxi=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

            if(sum == 0){
                maxi=i+1;
            }
            else {
                if(map.get(sum) != null) {

                    maxi=Math.max(maxi,(i-map.get(sum)));
                }
                else {

                    map.put(sum, i);
                }
            }
        }
        return maxi;
    }
}
