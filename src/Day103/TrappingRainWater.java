package Day103;
//https://leetcode.com/problems/trapping-rain-water/?envType=daily-question&envId=2024-04-12
//42. Trapping Rain Water
public class TrappingRainWater {
    class Solution {
        public int trap(int[] height) {

            int left=0;
            int right=height.length-1;

            int leftMax=0;
            int rightMax=0;
            int trappedWater=0;
            while(left<right){
                leftMax=Math.max(leftMax,height[left]);
                rightMax=Math.max(rightMax,height[right]);

                if(leftMax < rightMax){
                    trappedWater= trappedWater +(leftMax - height[left]);
                    left++;
                }
                else{
                    trappedWater= trappedWater+(rightMax - height[right]);
                    right--;
                }
            }
            return trappedWater;
        }
    }
}
