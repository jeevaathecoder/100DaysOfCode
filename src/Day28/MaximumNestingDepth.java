package Day28;

//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
public class MaximumNestingDepth {
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
