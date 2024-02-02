package Day17;
// Find Nth Root Of M
//https://www.codingninjas.com/studio/problems/nth-root-of-m_1062679
public class NthRootOfM {
    public static int NthRoot(int n, int m) {

        int s=1;
        int e=m;

        while(s<=e){
            int mid=(s+e)/2;
            if(Math.pow(mid,n) == m){
                return mid;
            }

            else if((Math.pow(mid,n))<m){
                s=mid+1;
            }

            else{
                e=mid-1;
            }
        }
        return -1;
    }
}
