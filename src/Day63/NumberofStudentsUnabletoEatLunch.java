package Day63;
//1700. Number of Students Unable to Eat Lunch
//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/?envType=daily-question&envId=2024-04-08

public class NumberofStudentsUnabletoEatLunch {
    class Solution {
        public int countStudents(int[] students, int[] sandwiches) {
            int student0 = 0;
            int student1 = 0;

            for (int student : students) {
                if (student == 0) {
                    student0++;
                } else {
                    student1++;
                }
            }

            for (int sandwich : sandwiches) {

                if (sandwich == 0 && student0 > 0) {
                    student0--;
                } else if (sandwich == 1 && student1 > 0) {
                    student1--;
                } else {
                    return (student0 + student1);
                }
            }

            return 0;
        }
    }

}
