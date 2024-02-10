package Day38;

//https://www.geeksforgeeks.org/problems/arithmetic-number2815/1?page=3&difficulty=Easy&sortBy=submissions
//Arithmetic Number
public class ArithmeticNumber {
    static int inSequence(int A, int B, int C){
        if(C==0)
        {
            if(A==B)
                return 1;
            return 0;
        }

         if((B-A)/C>=0 && (B-A)%C==0)
            return 1;
        return 0;
    }
}
