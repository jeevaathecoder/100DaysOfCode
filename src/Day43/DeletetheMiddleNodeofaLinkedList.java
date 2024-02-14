//package Day43;
//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
//2095. Delete the Middle Node of a Linked List
//public class DeletetheMiddleNodeofaLinkedList {
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
//        public ListNode deleteMiddle(ListNode head) {
//            if(head==null || head.next==null) return null;
//            ListNode slow=head;
//            ListNode fast = head;
//
//            fast = fast.next.next;
//
//            while(fast!=null && fast.next!=null){
//                slow=slow.next;
//                fast=fast.next.next;
//            }
//
//            ListNode del = slow.next;
//            slow.next = slow.next.next;
//            del.next=null;
//
//            return head;
//        }
//    }
//}
