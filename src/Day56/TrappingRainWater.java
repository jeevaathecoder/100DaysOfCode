package Day56;
//https://leetcode.com/problems/trapping-rain-water/
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
