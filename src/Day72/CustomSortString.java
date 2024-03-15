package Day72;
import java.util.HashMap;
//https://leetcode.com/problems/custom-sort-string/description/?envType=daily-question&envId=2024-03-11
//791. Custom Sort String
public class CustomSortString {


    class Solution {
        public String customSortString(String order, String s) {
            StringBuilder result = new StringBuilder();
            HashMap<Character, Integer> mp = new HashMap<>();
            for (char c : s.toCharArray()) {
                mp.put(c, mp.getOrDefault(c, 0) + 1);
            }
            for (char c : order.toCharArray()) {
                if (mp.containsKey(c)) {
                    result.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
                    mp.remove(c);
                }
            }
            for (char c : mp.keySet()) {
                result.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
            }
            return result.toString();
        }
    }
}
