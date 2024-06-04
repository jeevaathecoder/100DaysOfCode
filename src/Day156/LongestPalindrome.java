package Day156;
//409. Longest Palindrome
//https://leetcode.com/problems/longest-palindrome/description
public class LongestPalindrome {
    class Solution {
        public int longestPalindrome(String s) {
            int[] arr= new int[128];

            for(int i=0;i<s.length();i++){
                int index= s.charAt(i)-'A';
                arr[index]++;
            }


            int count=0;
            boolean flag=true;

            for(int num : arr){

                if( num % 2 == 0){
                    count += num;
                }
                else{
                    if(flag){
                        count+=1;
                    }
                    flag = false;
                    count += num-1;

                }
            }

            return count;
        }
    }
}
