package Day61;
//https://leetcode.com/problems/maximum-odd-binary-number/description/?envType=daily-question&envId=2024-03-01
//1903. Maximum Odd Binary Number
public class MaximumOddBinaryNumber {
    class Solution {
        public String maximumOddBinaryNumber(String s) {
            int cntOne = -1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    cntOne++;
                }
            }
            StringBuilder result = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(cntOne>0){
                    result.append('1');
                    cntOne--;
                }else if(i==s.length()-1){
                    result.append('1');
                }else{
                    result.append('0');
                }
            }
            return result.toString();
        }
    }
}
