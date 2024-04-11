package Day102;

import java.util.Stack;

//https://leetcode.com/problems/remove-k-digits/?envType=daily-question&envId=2024-04-11
//402. Remove K Digits
public class RemoveKDigits {
    class Solution {
        public String removeKdigits(String num, int k) {
            Stack<Character> stack = new Stack<>();

            for (char digit : num.toCharArray()) {
                while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                    stack.pop();
                    k--;
                }
                stack.push(digit);
            }

            while (k > 0 && !stack.isEmpty()) {
                stack.pop();
                k--;
            }


            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            sb.reverse();


            while (sb.length() > 0 && sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }


            return sb.length() > 0 ? sb.toString() : "0";
        }
    }
}
