package Day4;
import java.util.HashMap;
import java.util.Map;

//Find element occuring once when all other are present thrice
//https://www.geeksforgeeks.org/problems/find-element-occuring-once-when-all-other-are-present-thrice/1

public class FindEleOccurOnce {

        static int singleElement(int[] arr , int N) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<N;i++){
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }
            int ans=0;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                Integer value = entry.getValue();
                Integer key = entry.getKey();
                if(value == 1){
                    ans=key;
                }
            }
            return ans;
        }
    }


