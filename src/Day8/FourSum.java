package Day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/4sum/
//18. 4Sum

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j=i+1;j<n;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue;

                int left=j+1;
                int right=n-1;

                while(left<right){
                    long sum= nums[i];
                    sum+=nums[j];
                    sum+=nums[left];
                    sum+=nums[right];
                    if(sum<target){
                        left++;
                    }
                    else if(sum>target){
                        right--;
                    }

                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        ans.add(temp);

                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left-1]) left++;
                        while(left < right && nums[right] == nums[right+1]) right--;

                    }
                }
            }
        }
        return ans;
    }
}
