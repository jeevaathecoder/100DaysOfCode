package Day6;

import java.util.HashSet;
import java.util.Set;

//128. Longest Consecutive Sequence
//https://leetcode.com/problems/longest-consecutive-sequence/description/
public class LongestConsequetiveSequence {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length; i++){
            set.add(nums[i]);
        }
        int count=1;
        int maxCount=0;
        for(int i: set){
            if(!set.contains(i-1)){
                count=1;
                int index=i;
                while(set.contains(index+1)){
                    count++;
                    index = index+1;
                }

                maxCount= Math.max(count,maxCount);

            }
        }


        return maxCount;
    }
}
