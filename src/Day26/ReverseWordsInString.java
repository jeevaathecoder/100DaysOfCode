package Day26;
//151. Reverse Words in a String
//https://leetcode.com/problems/reverse-words-in-a-string/description/
public class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] splitStr = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder("");
        for(int i=splitStr.length-1;i>=0;i--){
            if(res.length()!=0)
                res.append(" ");
            res.append(splitStr[i]);
        }
        return res.toString();
    }

}
