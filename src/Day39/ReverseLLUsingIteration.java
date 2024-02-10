//package Day39;
//https://leetcode.com/problems/reverse-linked-list/
//206. Reverse Linked List
//public class ReverseLLUsingIteration {
//    public ListNode reverseList(ListNode head) {
//        ListNode temp = head;
//        ListNode prev= null;
//
//        while(temp != null){
//            ListNode front = temp.next;
//            temp.next=prev;
//            prev=temp;
//            temp=front;
//        }
//
//        return prev;
//    }
//}
