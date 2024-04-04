package Day96;
//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
//1614. Maximum Nesting Depth of the Parentheses

public class MaximumNestingDepthoftheParentheses {
    class Solution {
        public int maxDepth(String s) {
            int ans=0;
            int temp=0;
            for(char i : s.toCharArray()){
                if(i == '('){

                    temp++;
                }
                if(i ==')'){
                    temp--;
                }
                if(temp>ans){
                    ans=temp;
                }

            }
            return ans;
        }
    }
}
