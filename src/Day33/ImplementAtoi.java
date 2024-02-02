package Day33;

//https://www.geeksforgeeks.org/problems/implement-atoi/1
//Implement Atoi
public class ImplementAtoi {
    int atoi(String s) {
        int flag = 0;
        try{
            Integer.parseInt(s);
            flag = 1;
        }
        catch(Exception e){
            flag = 0;

        }
        if(flag==1){
            return Integer.valueOf(s);
        }

        else{
            return -1;
        }


    }
}
