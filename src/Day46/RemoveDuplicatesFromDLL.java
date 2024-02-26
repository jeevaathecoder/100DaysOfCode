//package Day46;
//https://www.codingninjas.com/studio/problems/remove-duplicates-from-a-sorted-doubly-linked-list_2420283
//Remove duplicates from a sorted doubly linked list
//public class RemoveDuplicatesFromDLL {
//    /********************************************************
//
//     Following is the class structure of the Node class:
//
//     class Node
//     {
//     public:
//     int data;
//     Node next;
//     Node(int data)
//     {
//     this.data = data;
//     this.next = null;
//     }
//     };
//
//     ********************************************************/
//
//    public class Solution {
//        public static Node uniqueSortedList(Node head) {
//
//            Node temp = head;
//            while (temp.next != null) {
//
//                if (temp.data == temp.next.data) {
//
//                    temp.next = temp.next.next;
//
//                } else {
//
//                    temp = temp.next;
//
//                }
//            }
//
//            return head;
//
//        }
//    }
//}
