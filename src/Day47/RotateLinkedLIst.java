//package Day47;
//https://leetcode.com/problems/rotate-list/
//61. Rotate List
//public class RotateLinkedLIst {
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
//        public ListNode rotateRight(ListNode head, int k) {
//            if((head==null)|| k==0) return head;
//
//            ListNode tail = head;
//            int len = 1;
//            while(tail.next!=null){
//                tail = tail.next;
//                len++;
//            }
//            if(len==1 || k%len==0 ) return head;
//
//            if(k>len){
//                k = k%len;
//            }
//            ListNode newLast = head;
//            for(int i=0; i<len-k-1; i++){
//                newLast = newLast.next;
//            }
//
//            ListNode newHead = newLast.next;
//            newLast.next = null;
//            tail.next = head;
//            head = newHead;
//            return head;
//        }
//    }
//}
