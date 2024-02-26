//package Day47;
//https://leetcode.com/problems/reverse-nodes-in-k-group/
//25. Reverse Nodes in k-Group
//public class ReverseNodesinkGroup {
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
//        public ListNode reverseKGroup(ListNode head, int k) {
//            ListNode temp = head;
//            ListNode kthNode = null;
//            ListNode preNode = null;
//
//            while(temp != null) {
//                int cnt = 1;
//
//                kthNode = temp;
//                while(kthNode != null && cnt < k) {
//                    kthNode = kthNode.next;
//                    cnt++;
//                }
//                if(kthNode == null) {
//                    preNode.next = temp;
//                    return head;
//                }
//
//                ListNode nextNode = kthNode.next;
//                kthNode.next = null;
//
//                reverse(temp);
//                if(temp == head) {
//
//                    head = kthNode;
//                }
//                else{
//                    preNode.next = kthNode;
//                }
//
//                preNode = temp;
//                temp = nextNode;
//            }
//            return head;
//        }
//        private ListNode reverse(ListNode head)
//        {
//            ListNode preNode = null;
//            ListNode curNode = head;
//            ListNode nextNode = head;
//
//            while(curNode != null)
//            {
//                nextNode = nextNode.next;
//
//                curNode.next = preNode;
//
//                preNode = curNode;
//                curNode = nextNode;
//            }
//            return preNode;
//        }
//    }
//}
