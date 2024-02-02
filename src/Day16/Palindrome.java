package Day16;

public class Palindrome {
    int isPalindrome(String S) {

        int i=0;

        int j=S.length()-1;

        while(i<j){

            if(S.charAt(i) != S.charAt(j)){
                return 0;
            }
            i++;

            j--;
        }

        return 1;
    }
}
