package Day2;
//Coding Ninjas
// Second Largest and Second Minimum Value in the Array Without Sorting
//https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960

public class SecondFirstAndLast {
    public static int[] getSecondOrderElements(int n, int []a) {

        int firstMin= Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int firstMax = Integer.MIN_VALUE;
        int secondMax  = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if(a[i]>firstMax){
                secondMax=firstMax;
                firstMax=a[i];
            }

            else if(a[i]>secondMax){
                secondMax = a[i];
            }

            if(a[i]<firstMin){
                secondMin=firstMin;
                firstMin=a[i];
            }

            else if(a[i]<secondMin){
                secondMin = a[i];
            }


        }

        return new int[]{secondMax , secondMin};
    }
}
