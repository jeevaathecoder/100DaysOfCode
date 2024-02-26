package Day48;

public class StackImplementation {
    public class Solution{
        static class Stack {

            int[] stack;
            int top;

            Stack(int capacity) {

                stack=new int[capacity];
                top=-1;

            }
            public void push(int num) {

                if(top==stack.length-1) {
                    return ;
                }
                top=top+1;

                stack[top]=num;
                return;

            }
            public int pop() {



                if(top==-1){

                    return -1;

                }
                int res=stack[top];
                top=top-1;

                return res;

            }

            public int top() {

                if(top==-1){
                    return -1;

                }

                return stack[top];

            }

            public int isEmpty() {


                if(top==-1){
                    return 1;

                }

                else
                    return 0;
            }

            public int isFull() {

                if(top==stack.length-1) {

                    return 1;

                }

                return 0;

            }

        }
    }
}
