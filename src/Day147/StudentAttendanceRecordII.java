package Day147;
//552. Student Attendance Record II
//https://leetcode.com/problems/student-attendance-record-ii/description
public class StudentAttendanceRecordII {
    class Solution {

        private static final int MOD = 1000000000 + 7;

        public int checkRecord(int n) {
            int prevDP[][] = new int[2][3];
            prevDP[0][0] = 1;
            prevDP[0][1] = 1;
            prevDP[0][2] = 1;
            prevDP[1][0] = 1;
            prevDP[1][1] = 1;
            prevDP[1][2] = 1;

            for(int i = 1; i <= n; i++){
                int newDP[][] = new int[2][3];
                for(int a = 0; a < 2; a++){
                    for(int l = 0; l < 3; l++){
                        //Pick P
                        newDP[a][l] += prevDP[a][2];
                        if(a > 0){
                            //Pick A
                            newDP[a][l] += prevDP[a - 1][2];
                            newDP[a][l] %= MOD;
                        }
                        if(l > 0){
                            // Pick L
                            newDP[a][l] += prevDP[a][l - 1];
                            newDP[a][l] %= MOD;
                        }
                    }
                }
                prevDP = newDP;
            }

            return prevDP[1][2];
        }
    }
}
