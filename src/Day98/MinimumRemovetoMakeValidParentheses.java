package Day98;

//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/?envType=daily-question&envId=2024-04-06
//1249. Minimum Remove to Make Valid Parentheses

public class MinimumRemovetoMakeValidParentheses {
    class Solution {
        public String minRemoveToMakeValid(String s) {
            StringBuilder sb = new StringBuilder();
            int open=0;
            for(char c:s.toCharArray()){
                if(c == '('){
                    open++;
                }
                if( c == ')'){
                    if(open == 0) continue;
                    open--;
                }

                sb.append(c);
            }

            StringBuilder answer= new StringBuilder();

            for(int i=sb.length()-1;i>=0;i--){
                if(sb.charAt(i) == '(' && open-- > 0){
                    continue;
                }

                answer.append(sb.charAt(i));
            }

            return answer.reverse().toString();
        }

    }
}
