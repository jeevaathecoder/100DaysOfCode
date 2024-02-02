package Day33;
//1781. Sum of Beauty of All Substrings
//https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/
import java.util.HashMap;
import java.util.Map;

public class SumOfBeautyOfAllSubStrings {

    public static void main(String[] args) {
        String a="aabcb";
        System.out.println(beautySum(a));
    }
    public static int beautySum(String s) {
        int res=0;

        for(int i=0;i<s.length();i++){

            HashMap<Character, Integer> hs = new HashMap<>();

            for(int j=i;j<s.length();j++){
                int max = Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                hs.put(s.charAt(j),hs.getOrDefault(s.charAt(j),0)+1);
                if(hs.size() == 1) continue;
                else{
                    for (Map.Entry<Character, Integer> entry : hs.entrySet()){
                        max=Math.max(max,entry.getValue());
                        min=Math.min(min,entry.getValue());
                    }
                    res+=(max-min);
                }
            }
        }
        return res;
    }
}
