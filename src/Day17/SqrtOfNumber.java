package Day17;

// Square Root of a number
//https://www.codingninjas.com/studio/problems/square-root-integral_893351
public class SqrtOfNumber {
    public static int sqrtN(long N) {
        long low = 1;
        long high = N;

        while(low <= high) {
            long mid = low + (high - low) / 2;
            if(mid*mid == N){
                return (int)mid;
            }
            else if(mid*mid < N) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }

        return (int)high;
    }
}
