//package Day83;
//https://leetcode.com/problems/palindrome-linked-list/?envType=daily-question&envId=2024-03-22
//PalindromeLinkedList
//public class PalindromeLL {
//    class Solution {
//
//        public boolean isPalindrome(ListNode head) {
//            if (head == null || head.next == null) {
//                return true;
//            }
//
//            ListNode slow = head;
//            ListNode fast = head;
//            while (fast.next != null && fast.next.next != null) {
//                slow = slow.next;
//                fast = fast.next.next;
//            }
//            ListNode newHead = reverseLinkedList(slow.next);
//            ListNode first = head;
//            ListNode second = newHead;
//            while (second != null) {
//
//                if (first.val != second.val) {
//
//                    reverseLinkedList(newHead);
//                    return false;
//                }
//
//                first = first.next;
//
//                second = second.next;
//            }
//
//            reverseLinkedList(newHead);
//            return true;
//        }
//        public ListNode reverseLinkedList(ListNode head) {
//
//            if (head == null || head.next == null) {
//                return head;
//            }
//            ListNode newHead = reverseLinkedList(head.next);
//            ListNode front = head.next;
//            front.next = head;
//            head.next = null;
//            return newHead;
//        }
//    }
//}
