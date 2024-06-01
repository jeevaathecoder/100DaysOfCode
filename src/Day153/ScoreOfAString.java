package Day153;

//3110. Score of a String
//https://leetcode.com/problems/score-of-a-string/


public class ScoreOfAString {
    class Solution {
        public int scoreOfString(String s) {
            char[] arr = s.toCharArray();
            int first=0;
            int second=1;
            int sum=0;
            while(second<arr.length){
                sum+=Math.abs(arr[first]-arr[second]);
                first++;
                second++;
            }
            return sum;
        }
    }
}
