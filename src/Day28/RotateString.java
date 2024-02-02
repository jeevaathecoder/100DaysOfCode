package Day28;

import java.util.Arrays;

public class RotateString {
    public static void main(String[] args) {
        String s= "abcde";
        String goal ="cdeab";
        System.out.println(rotateString(s,goal));

    }
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String a = s+s;

        int ifPresentIndex = a.indexOf(goal);
        return ifPresentIndex>=0;
    }


}


