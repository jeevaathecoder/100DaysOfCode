//package Day46;
//https://www.codingninjas.com/studio/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list_8160461
//Delete all occurrences of a given key in a doubly linked list
//public class DeleteAllOccuranceInDLL {
//    /****************************************************************
//
//     Following is the class structure of the Node class:
//
//     class Node {
//     public int data;
//     public Node next;
//     public Node prev;
//
//     Node()
//     {
//     this.data = 0;
//     this.next = null;
//     this.prev = null;
//     }
//     Node(int data)
//     {
//     this.data = data;
//     this.next = null;
//     this.prev = null;
//     }
//     Node(int data, Node next, Node prev)
//     {
//     this.data = data;
//     this.next = next;
//     this.prev = prev;
//     }
//     }
//
//     *****************************************************************/
//
//    public class Solution {
//
//        public static Node deleteAllOccurrences(Node head, int k) {
//
//            Node temp = head;
//            while(temp != null){
//
//                if(temp.data == k){
//
//                    if(temp == head){
//
//                        head = head.next;
//                    }
//
//                    Node prevNode = temp.prev;
//                    Node nextNode = temp.next;
//                    if(nextNode != null) nextNode.prev = prevNode;
//                    if(prevNode != null) prevNode.next = nextNode;
//
//                    temp = nextNode;
//                }
//                else{
//                    temp = temp.next;
//                }
//
//            }
//
//            return head;
//
//        }
//
//    }
//}
