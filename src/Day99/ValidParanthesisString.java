package Day99;

import java.util.Stack;

//678. Valid Parenthesis String
//https://leetcode.com/problems/valid-parenthesis-string/
public class ValidParanthesisString {
    public class Solution {

        public static boolean checkValidString(String s) {

            Stack<Integer> pair = new Stack<>();
            Stack<Integer> star = new Stack<>();

            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);

                if(ch =='(') {
                    pair.push(i);


                } else if (ch == '*') {
                    star.push(i);

                } else {


                    if(!pair.isEmpty()) {
                        pair.pop();

                    } else if (!star.isEmpty()) {
                        star.pop();

                    } else {
                        return false;
                    }
                }
            }


            return isBalanced(pair, star);
        }

        public static boolean isBalanced(Stack<Integer> pair, Stack<Integer> star) {

            while(!pair.isEmpty()) {

                if(star.isEmpty()) {
                    return false;

                } else if(star.peek() > pair.peek()) {
                    star.pop();  pair.pop();

                } else {
                    return false;
                }
            }

            return true;
        }
    }

}
