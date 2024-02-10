package Day38;

import java.util.Stack;
//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&difficulty=Easy&sortBy=submissions
//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&difficulty=Easy&sortBy=submissions
public class ParanthesisChecker {static boolean ispar(String x)
{
    Stack<Character> stack=new Stack<>();
    char c[]=x.toCharArray();
    for(int i=0;i<c.length;i++){
        if(c[i]=='('){
            stack.push(')');
        }
        else if(c[i]=='['){
            stack.push(']');
        }
        else if(c[i]=='{'){
            stack.push('}');
        }
        else if(stack.isEmpty() || stack.pop()!=c[i]){
            return false;
        }
    }
    if(stack.isEmpty()){
        return true;
    }
    return false;
}
}
