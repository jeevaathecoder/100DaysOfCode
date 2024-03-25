package Day74;

class FindPivotElement{
    public static void main(String[] args) {
        String s="";
        int[] arr={0,1,1,0,0,1,1,0,1};

        int first=0;
        int second=1;
        int third=2;
        int count=0;

        while(third<arr.length) {
            if(arr[first]==arr[third] && arr[second]!=arr[third]){
                count++;
            }
            first=third;
            second=third+1;
            third=third+2;
        }

        System.out.println(count);

    }
}