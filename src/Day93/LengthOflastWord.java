package Day93;
//Length of Last Word
//https://leetcode.com/problems/length-of-last-word/?envType=daily-question&envId=2024-04-01
public class LengthOflastWord {
    class Solution {
        public int lengthOfLastWord(String s) {

            String[] arr= s.split(" ");
            int n=arr.length-1;
            String ans=arr[n];
            return ans.length();
        }
    }

}
