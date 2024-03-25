package Day79;
//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/?envType=daily-question&envId=2024-03-18
//452. Minimum Number of Arrows to Burst Balloons

import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons {
    class Solution {
        public int findMinArrowShots(int[][] points) {

            Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
            int end= points[0][1];
            int arrow=1;


            for(int i=1;i<points.length; i++){
                if(points[i][0] > end){
                    arrow++;
                    end=points[i][1];
                }
            }
            return arrow;
        }
    }
}
