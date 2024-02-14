//package Day45;
//https://www.codingninjas.com/studio/problems/add-one-to-a-number-represented-as-linked-list_920557
// Add one to a number represented as Linked ListA
//public class Add1ToLinkedLIst {
//    import java.util.* ;
//import java.io.*;
//    /*************************************************************
//
//     Following is the class structure of the Node class:
//
//     class Node {
//     public int data;
//     public Node next;
//
//     Node(int data) {
//     this.data = data;
//     this.next = null;
//     }
//     }
//
//     *************************************************************/
//
//    public class Solution {
//
//        public static int helper(Node head)
//
//        {
//
//            if(head==null) return 1;
//
//            int c=helper(head.next);
//
//            head.data=head.data+c;
//
//            if(head.data<10)
//
//                return 0;
//
//            head.data=0;
//            return 1;
//
//
//
//        }
//
//        public static Node addOne(Node head) {
//
//
//            int c=helper(head);
//
//            if(c==1)
//
//            {
//
//                Node newnode=new Node(1);
//
//                newnode.next=head;
//
//                return newnode;
//
//            }
//
//            return head;
//
//        }
//
//    }
//}
