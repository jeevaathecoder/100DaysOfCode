//package Day128;
//
////2816. Double a Number Represented as a Linked List
////https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/
//public class DoubleaNumberRepresentedAsALinkedList {
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
//        public ListNode doubleIt(ListNode head) {
//
//            if (head.val > 4) {
//                head = new ListNode(0, head);
//            }
//
//            ListNode temp = head;
//            while (temp != null) {
//
//                temp.val = (temp.val * 2) % 10;
//
//                if (temp.next != null && temp.next.val > 4) {
//                    temp.val++;
//                }
//
//                temp = temp.next;
//            }
//
//            return head;
//        }
//    }
//
//}
