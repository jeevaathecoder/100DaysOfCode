package Day50;

//import java.util.HashMap;//https://www.geeksforgeeks.org/problems/game-with-string4100/1
//Game with String

import java.util.Arrays;
import java.util.HashMap;

public class GameWithString {
    class Solution{
        static int minValue(String s, int k){


            HashMap<Character,Integer> hs=new HashMap<>();

            for(int i=0;i<s.length();i++)
            {
                if(hs.containsKey(s.charAt(i)))
                {
                    hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
                }
                else
                {
                    hs.put(s.charAt(i),1);
                }
            }
            int arr[]=new int[hs.size()];

            int index=0;
            for(char a:hs.keySet())
            {
                arr[index]=hs.get(a);
                index++;
            }

            Arrays.sort(arr);
            int ans=0;
            int j=arr.length-1;
            while(k!=0)
            {
                arr[j]= arr[j]-1;
                Arrays.sort(arr);
                k--;
            }
            for(int i=0;i<arr.length;i++)
            {
                ans+=Math.pow(arr[i],2);
            }
            return ans;

        }
    }

}
