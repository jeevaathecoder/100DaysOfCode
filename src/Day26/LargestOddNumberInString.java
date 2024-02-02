package Day26;
//1903. Largest Odd Number in String
//https://leetcode.com/problems/largest-odd-number-in-string/submissions/1157118224/
public class LargestOddNumberInString {

    public static void main(String[] args) {
        String a="34";
        largestOddNumber(a);
    }
    public static String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            int current=num.charAt(i-'0');
            if(current%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
