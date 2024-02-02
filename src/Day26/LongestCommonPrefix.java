package Day26;
//https://leetcode.com/problems/longest-common-prefix/
//14. Longest Common Prefix
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0){
            return " ";
        }
        String longest = strs[0];

        for(int i=1 ;i<strs.length; i++){
            String cs = strs[i];
            int j=0;
            while(j<longest.length() && j<cs.length() &&
                    longest.charAt(j) == cs.charAt(j) )
            {
                j++;
            }

            longest=longest.substring(0,j);

        }

        return longest;
    }
}
