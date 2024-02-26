package Day49;

import java.util.ArrayList;

//225. Implement Stack using Queues
//https://leetcode.com/problems/implement-stack-using-queues/description/
public class ImplementStackusingQueues {
    class MyStack {
        public ArrayList<Integer> stack;

        public MyStack() {
            this.stack = new ArrayList<Integer>();
        }

        public void push(int x) {
            this.stack.add(x);
        }

        public int pop() {
            return this.stack.remove(this.stack.size() - 1);
        }

        public int top() {
            return this.stack.get(this.stack.size() - 1);
        }

        public boolean empty() {
            return this.stack.size() == 0 ? true : false;
        }
    }
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
