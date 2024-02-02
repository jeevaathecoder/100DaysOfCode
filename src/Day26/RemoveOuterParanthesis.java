package Day26;
//1021. Remove Outermost Parentheses
//https://leetcode.com/problems/remove-outermost-parentheses/
public class RemoveOuterParanthesis {
    public String removeOuterParentheses(String s) {
        int length=s.length();

        if(length<=2){
            return "";
        }
        char[] arr = s.toCharArray();

        StringBuilder builder = new StringBuilder();

        int open=1;

        for(int i=1; i<arr.length; i++){
            if(arr[i] == '('){
                open++;
                if(open>1) builder.append('(');

            }
            else{
                if(open>1) builder.append(')');
                open--;
            }
        }

        return builder.toString();
    }
}
