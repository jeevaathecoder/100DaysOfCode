//package Day81;
//https://leetcode.com/problems/merge-in-between-linked-lists/?envType=daily-question&envId=2024-03-20
//Merge In Between Linked Lists
//import Day35.ListNode;
//
//public class MergeInBetweenLinkedLists {
//    class Solution {
//        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
//            ListNode currNode = list1;
//            int index = 0;
//            while (index < a - 1) {
//                currNode = currNode.next;
//                index++;
//            }
//            ListNode front = currNode;
//            while (index < b + 1) {
//                currNode = currNode.next;
//                index++;
//            }
//            ListNode rear = currNode;
//            ListNode secondListTail = list2, secondListHead = list2;
//            while (secondListTail.next != null) {
//                secondListTail = secondListTail.next;
//            }
//            front.next = secondListHead;
//            secondListTail.next = rear;
//            return list1;
//        }
//    }
//}
//
//
