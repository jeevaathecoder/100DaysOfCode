package Day3;
//2125. Number of Laser Beams in a Bank
//https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
public class NoOfLaserBeams {
    public int numberOfBeams(String[] bank) {
        int count=0;
        int curNum=0;
        for (int i = 0; i < bank.length; i++) {
            int temp=0;
            char[]ch=bank[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '1') {
                    temp++;
                }
            }
            if(temp==0 ){
                continue;
            }
            count =count + curNum * temp;
            curNum=temp;
        }
        return count;
    }
}
