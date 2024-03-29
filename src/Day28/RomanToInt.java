package Day28;

public class RomanToInt {
    public int romanToInt(String s) {

        int previous = translate(s.charAt(0));
        int sum=0;

        for(int i=1; i<s.length() ; i++){
            int current = translate(s.charAt(i));

            if(current>previous){
                sum-=previous;
            }
            else{
                sum+=previous;
            }

            previous=current;
        }

        sum+=previous;


        return sum;
    }


    public int translate(char c){
        switch(c){
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;


            case 'C':
                return 100;

            case 'D':
                return 500;


            case 'M':
                return 1000;
        }
        return 0;
    }
}
