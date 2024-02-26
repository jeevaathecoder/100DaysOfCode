package Day56;

import java.util.List;

public class TwoStacks {
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        int result =0,s1Count=0,st2Count=0,totalSum=0;
        for (Integer s1Element : a){
            if(totalSum+s1Element >maxSum)break;
            totalSum +=s1Element;
            s1Count++;

        }
        result = s1Count;
        for(Integer s2Element:b){
            totalSum += s2Element;
            st2Count++;
            while(totalSum >maxSum && s1Count > 0){
                totalSum -=a.get(s1Count-1);
                s1Count--;
            }
            result = (totalSum <= maxSum)?Math.max(s1Count + st2Count , result):result;
        }
        return result;

    }

}

