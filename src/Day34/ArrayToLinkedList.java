package Day34;
// Introduction To Linked List
//https://www.codingninjas.com/studio/problems/introduction-to-linked-list_8144737
public class ArrayToLinkedList {
    public static Node constructLL(int []arr) {
        Node head= new Node(arr[0]);
        Node mover = head;

        for(int i=1; i<arr.length ;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }


}
