package Day6;

import java.util.ArrayList;
import java.util.List;

//https://www.codingninjas.com/studio/problems/superior-elements_6783446
//Superior Elements
public class LeadersInArray {
    public static List< Integer > superiorElements(int []a) {


        List<Integer> list = new ArrayList<>();
        int n=a.length-1;
        list.add(a[n]);
        int max=a[n];
        for( int i=n-1; i>=0; i--){
            if(a[i]>max){
                list.add(a[i]);
                max=a[i];
            }    }

        return list;
    }
}
