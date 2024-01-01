package Day1;

import java.util.Arrays;

//LeetCode
//455. Assign Cookies
//Link - https://leetcode.com/problems/assign-cookies/description/
public class Main {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3}, new int[] {1,4,1}));
    }

    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        int n = g.length, m = s.length;
        while (i < n && j < m) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else j++;
        }
        return count;

    }

}