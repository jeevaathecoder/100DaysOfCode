//package Day45;
// https://leetcode.com/problems/add-two-numbers/description/
// 2. Add Two Numbers
//public class Add2LL {
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
//        public ListNode addTwoNumbers(ListNode number1, ListNode number2) {
//
//            ListNode dummy = new ListNode(0);
//            ListNode current = dummy;
//            int count=0;
//            while(number1!=null||number2!=null){
//                int sum=count;
//                if(number1!=null){
//                    sum=sum+number1.val;
//                    number1=number1.next;
//                }
//                if(number2!=null){
//                    sum=sum+number2.val;
//                    number2=number2.next;
//                }
//                count = (sum/10);
//                current.next=new ListNode(sum%10);
//                current=current.next;
//            }
//            if(count==1)current.next=new ListNode(1);
//            return dummy.next;
//        }
//    }
//}
