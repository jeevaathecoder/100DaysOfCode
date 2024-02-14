package Day42;

import java.util.ArrayList;
import java.util.HashSet;

//https://www.geeksforgeeks.org/problems/recamans-sequence4856/1
//Recamans sequence
public class RecamansSequence {
    class Solution{

        static ArrayList<Integer> recamanSequence(int n){

            HashSet<Integer> hs=new HashSet<>();
            ArrayList <Integer> al=new ArrayList<>();
            al.add(0);
            int prev=0;
            for(int  i=1;i<n;i++){
                int ans=prev-i;
                if(ans<=0 || hs.contains(ans)){
                    ans=prev+i;
                }
                hs.add(ans);
                al.add(ans);
                prev=ans;
            }
            return al;
        }
    }
}
