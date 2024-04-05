package Day97;
//https://leetcode.com/problems/make-the-string-great/?envType=daily-question&envId=2024-04-05
//1544. Make The String Great
import java.util.Stack;

public class MakeTheStringGreat {
    class Solution {
        public String makeGood(String s) {
            Stack<Character> stack=new Stack<>();

            for(int i=0;i<s.length();i++)
            {

                if(stack.size()>0&&stack.peek()!=s.charAt(i)){
                    String t1=""+stack.peek();
                    String t2=""+s.charAt(i);
                    if(t1.toLowerCase().equals(t2.toLowerCase()))stack.pop();
                    else stack.push(s.charAt(i));
                }
                else
                    stack.push(s.charAt(i));

            }
            String str="";
            while(stack.size()>0){
                str=stack.pop()+str;
            }
            return str;

        }
    }
}
