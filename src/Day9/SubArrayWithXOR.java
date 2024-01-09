package Day9;

import java.util.HashMap;
//https://www.codingninjas.com/studio/problems/subarrays-with-xor-k_6826258
//Subarrays with XOR ‘K’
public class SubArrayWithXOR {
    public static int subarraysWithSumK(int []a, int b) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int xor=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            xor=xor^a[i];
            if(xor == b){
                count++;
            }

            if(map.containsKey(xor^b)){
                count+=map.get(xor^b);
            }
            map.put(xor, map.getOrDefault(xor, 0)+1);

        }
        return count;
    }
}
