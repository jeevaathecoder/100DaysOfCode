package Day58;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
//20. Valid Parentheses
public class ValidParenthesis {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>();

            for (char c : s.toCharArray()) {

                if (c == '(')
                    stack.push(')');
                else if (c == '{')
                    stack.push('}');
                else if (c == '[')
                    stack.push(']');
                else if (stack.isEmpty() || stack.pop() != c)

                    return false;
            }

            return stack.isEmpty();
        }
    }
}
