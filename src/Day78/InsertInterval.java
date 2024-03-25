package Day78;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/insert-interval/?envType=daily-question&envId=2024-03-17
//57. Insert Interval
public class InsertInterval {
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            List<int[]> ans = new ArrayList<>();

            int current=0;

            while(current<intervals.length && intervals[current][1] < newInterval[0]){
                ans.add(intervals[current++]);
            }

            while(current<intervals.length && intervals[current][0] <= newInterval[1]){
                newInterval[0]= Math.min(intervals[current][0] , newInterval[0]);
                newInterval[1]= Math.max(intervals[current][1] , newInterval[1]);
                current++;
            }

            ans.add(newInterval);

            while(current<intervals.length){
                ans.add(intervals[current++]);
            }

            return ans.toArray(new int[ans.size()][]);

        }
    }
}
