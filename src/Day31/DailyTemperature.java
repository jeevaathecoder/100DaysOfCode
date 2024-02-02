package Day31;

//739. Daily Temperatures
//https://leetcode.com/problems/daily-temperatures/?envType=daily-question&envId=2024-01-31
import java.util.Stack;
public class DailyTemperature {
    public int[] dailyTemperatures(int[] temps) {

        int[] results = new int[temps.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <temps.length; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return results;
    }
}


