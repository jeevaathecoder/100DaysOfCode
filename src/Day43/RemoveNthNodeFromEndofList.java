//package Day43;
//19. Remove Nth Node From End of List
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
//public class RemoveNthNodeFromEndofList {
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
//        public ListNode removeNthFromEnd(ListNode head, int n) {
//            ListNode fast = head;
//
//            for(int i=0;i<n ; i++){
//
//                fast = fast.next;
//            }
//            if(fast == null) return head.next;
//            ListNode slow = head;
//
//            while(fast.next!=null){
//                fast=fast.next;
//                slow=slow.next;
//            }
//            ListNode del=slow.next;
//            slow.next = slow.next.next;
//            del = null;
//            return head;
//        }
//    }
//}
