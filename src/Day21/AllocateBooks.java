package Day21;

import java.util.ArrayList;

// Allocate Books
//https://www.codingninjas.com/studio/problems/allocate-books_1090540?leftPanelTabValue=PROBLEM
public class AllocateBooks {
    boolean isPossible(ArrayList<Integer> arr , int mid, int m)

    {

        int sum=0;
        int student=1;
        for(int i=0;i<arr.size();i++)
        {
            sum=sum+arr.get(i);
            if(sum>mid)

            {
                student++;
                sum=arr.get(i);
            }
        }
        return (student<=m);
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m)
    {
        Solution s1 = new Solution();
        int max =0;
        int sum=0;
        int ans=-1;
        if(n<m)
        {
            return ans;

        }



        for(int i=0;i<n;i++)

        {

            sum=sum+arr.get(i);

            max=Math.max(max,arr.get(i));

        }

        int lo=max;

        int ho=sum;

        while(lo<=ho)

        {

            int mid=(lo+ho)/2;

            if(s1.isPossible(arr,mid,m)==true)

            {

                ans=mid;

                ho=mid-1;

            }

            else

            {

                lo=mid+1;

            }

        }

        return ans ;

    }

}
