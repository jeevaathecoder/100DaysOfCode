package Day20;

import java.util.Hashtable;

//https://leetcode.com/problems/isomorphic-strings/description/
//205. Isomorphic Strings
public class IsoMorphicString {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Hashtable<Character , Character> hashtable = new Hashtable<>();
        for (int i = 0; i < s.length(); i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (hashtable.containsKey(c1))
            {
                if (hashtable.get(c1) != c2) return false;
            }
            else {
                if (hashtable.containsValue(c2)) return false;
                hashtable.put(c1 , c2);
            }
        }

        return true;
    }
}
