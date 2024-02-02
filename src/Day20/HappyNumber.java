package Day20;

import java.util.HashSet;
//202. Happy Number
//https://leetcode.com/problems/happy-number/description/
public class HappyNumber {
    public boolean isHappy(int n) {

        HashSet<Integer> hashSet = new HashSet<>();

        while (hashSet.add(n)){

            int total = 0 ;

            while (n>0){

                total+= (n%10) * (n%10);
                n/=10;

            }

            if (total==1){
                return true;
            }

            else {
                n=total;
            }

        }

        return false;

    }
}
