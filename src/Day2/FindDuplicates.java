package Day2;

import java.util.ArrayList;
//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays&sortBy=submissions
//Find duplicates in an array
public class FindDuplicates {
    class Solution {

        public static ArrayList<Integer> duplicates(int arr[], int n) {

            int freq[] = new int[n];
            for(int i : arr){
                freq[i]++;
            }
            ArrayList<Integer> ans = new ArrayList<>();

            for(int i=0;i<n;i++){
                if(freq[i] > 1)
                    ans.add(i);
            }

            if(ans.isEmpty())
                ans.add(-1);
            return ans;

        }
    }
}
