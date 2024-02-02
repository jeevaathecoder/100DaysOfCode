package Day16;

public class EquilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {
        int ls=0;
        int rs=0;
        for(int i=0;i<n;i++){
            rs+=arr[i];
        }
        for(int i=0;i<n;i++){
            rs-=arr[i];
            if(ls==rs){
                return i+1;
            }
            ls+=arr[i];
        }
        return -1;
    }
}
