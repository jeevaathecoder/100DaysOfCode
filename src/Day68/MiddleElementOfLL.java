//package Day68;
//
//public class MiddleElementOfLL {
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//    class Solution {
//        public ListNode middleNode(ListNode head) {
//            ListNode First_ptr = head , second_ptr = head;
//            while(First_ptr != null && First_ptr.next != null){
//                second_ptr = second_ptr.next;
//                First_ptr = First_ptr.next.next;
//            }
//            return second_ptr ;
//        }
//    }
//}
