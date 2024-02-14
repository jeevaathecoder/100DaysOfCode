//package Day42;
//https://leetcode.com/problems/odd-even-linked-list/
//328. Odd Even Linked List
//public class SegregateOddAndEven {
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
//        public ListNode oddEvenList(ListNode head) {
//            if(head==null) return null;
//            ListNode even = head;
//
//            ListNode even_head = even;
//
//            ListNode odd = head.next;
//            ListNode odd_head = odd;
//
//            if(odd==null){
//                return head;
//            }
//            while(even.next!=null && odd.next!=null){
//                even.next=odd.next;
//                even = even.next;
//                odd.next = even.next;
//                odd = odd.next;
//            }
//            even.next=odd_head;
//            return even_head;
//
//        }
//    }
//}
