package Day12;

public class SubArrayProduct {

    public static void main(String[] args) {
        int[] arr= {2,3,-2,4};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {

        int prefix=1;
        int suffix=1;

        int max =Integer.MIN_VALUE;

        for(int i=0;i<nums.length; i++){
            prefix=prefix * nums[i];

            max=Math.max(max,prefix);
            if(prefix==0){
                prefix=1;

            }

        }

        for(int i=nums.length-1;i>=0; i--){
            suffix=suffix * nums[i];

            max=Math.max(max,suffix);
            if(suffix==0){
                suffix=1;

            }


        }
        return max;
    }
}
