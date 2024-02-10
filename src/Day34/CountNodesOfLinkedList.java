package Day34;
//https://www.codingninjas.com/studio/problems/count-nodes-of-linked-list_5884
// Count nodes of linked list
public class CountNodesOfLinkedList {
    public static int length(Node head){
        int count=0;

        Node temp=head;

        while(temp != null){
            count++;
            temp = temp.next;

        }
        return count;


    }
}
