package Day34;
//Search in a Linked List
//https://www.codingninjas.com/studio/problems/search-in-a-linked-list_975381
public class SearchElementInLinkedList {
    public static int searchInLinkedList(Node head, int k)
    {
        Node temp = head;

        while(temp != null){
            if(temp.data == k){
                return 1;
            }

            temp=temp.next;
        }
        return 0;


    }
}
