//package Day41;
// Find length of Loop
//https://www.codingninjas.com/studio/problems/find-length-of-loop_8160455
//public class LengthOfALoop {
//    public static int lengthOfLoop(Node head) {
//        Node fast= head;
//        Node slow = head;
//
//        while(fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast=fast.next.next;
//
//            if(fast == slow){
//                fast=fast.next;
//                int count=1;
//                while(fast !=slow){
//                    count++;
//                    fast=fast.next;
//                }
//
//                return count;
//            }
//
//
//        }
//        return 0;
//
//    }
//}
