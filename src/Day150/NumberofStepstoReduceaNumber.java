package Day150;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
//1404. Number of Steps to Reduce a Number in Binary Representation to One
public class NumberofStepstoReduceaNumber {
    class Solution {
        public int numSteps(String s) {
            int cnt = 0;
            int cary = 0;

            for(int i = s.length()-1; i >= 1; i--){
                int num = s.charAt(i) -'0';
                if(num == 0 && cary == 0){
                    cnt++;
                }else if(num == 1 && cary == 1){
                    cnt++;
                    cary = 1;
                }else{
                    cnt += 2;
                    cary = 1;
                }
            }
            if(cary == 1)cnt++;
            return cnt;
        }
    }
}
