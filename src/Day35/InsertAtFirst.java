package Day35;

//https://www.codingninjas.com/studio/problems/insert-node-at-the-beginning_8144739
//Insert Node At The Beginning
     class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
     this.data = 0;
     this.next = null;
     this.prev = null;
     }

     Node(int data)
     {
     this.data = data;
     this.next = null;
     this.prev = null;
     }

     Node(int data, Node next)
     {
     this.data = data;
     this.next = next;
     this.prev = next;
     }
     };


public class InsertAtFirst
    {
        public static Node insertAtFirst(Node list, int newValue) {
            Node temp = new Node(newValue);
            temp.next= list;
            return temp;

        }
    }

