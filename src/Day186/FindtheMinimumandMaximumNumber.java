//package Day186;
//
//import Day35.ListNode;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class FindtheMinimumandMaximumNumber {
//
//    class Solution {
//        public int[] nodesBetweenCriticalPoints(ListNode head) {
//            if (head == null || head.next == null || head.next.next == null) {
//                return new int[]{-1, -1};
//            }
//
//            List<Integer> criticalPoints = new ArrayList<>();
//            ListNode prev = head;
//            ListNode curr = head.next;
//            int position = 1;
//
//            while (curr.next != null) {
//                if ((curr.val > prev.val && curr.val > curr.next.val) ||
//                        (curr.val < prev.val && curr.val < curr.next.val)) {
//                    criticalPoints.add(position);
//                }
//                prev = curr;
//                curr = curr.next;
//                position++;
//            }
//
//            if (criticalPoints.size() < 2) {
//                return new int[]{-1, -1};
//            }
//
//            int minDistance = Integer.MAX_VALUE;
//            int maxDistance = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);
//
//            for (int i = 1; i < criticalPoints.size(); i++) {
//                minDistance = Math.min(minDistance, criticalPoints.get(i) - criticalPoints.get(i - 1));
//            }
//
//            return new int[]{minDistance, maxDistance};
//        }
//    }
//}
