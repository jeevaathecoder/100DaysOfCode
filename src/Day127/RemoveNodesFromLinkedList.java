//package Day127;
////https://leetcode.com/problems/remove-nodes-from-linked-list/
////2487. Remove Nodes From Linked List
//public class RemoveNodesFromLinkedList {
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
//        public ListNode removeNodes(ListNode head) {
//            ListNode temp = head;
//
//            Stack<ListNode> stack = new Stack<>();
//            while(temp!=null){
//                while(!stack.isEmpty() && stack.peek().val<temp.val){
//                    stack.pop();
//                }
//                stack.push(temp);
//                temp = temp.next;
//            }
//
//            ListNode nxt=null;
//            while(!stack.isEmpty()){
//                temp = stack.pop();
//                temp.next = nxt;
//                nxt = temp;
//            }
//
//            return temp;
//
//        }
//    }
//}
