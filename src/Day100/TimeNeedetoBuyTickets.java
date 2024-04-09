package Day100;
//https://leetcode.com/problems/time-needed-to-buy-tickets/?envType=daily-question&envId=2024-04-09
//2034. Time Needed to Buy Tickets
public class TimeNeedetoBuyTickets {
    class Solution {
        public int timeRequiredToBuy(int[] tickets, int k) {
            int total = 0;

            for (int i = 0; i < tickets.length; i++) {
                if (i <= k) {
                    total += Math.min(tickets[i], tickets[k]);
                } else {
                    total += Math.min(tickets[i], tickets[k] - 1);
                }
            }

            return total;
        }
    }
}
