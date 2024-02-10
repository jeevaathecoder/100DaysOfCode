package Day36;

import java.util.LinkedList;
public class LLProblems {
    public static void main(String[] args) {
        int[] arr = {23,44,63,12,33};
        Node head = converToLL(arr);

//        printLL(head);
//       head = deleteHead(head);
        printLL(head);
        head = insertAtKthPosition(head,3,4555);
        printLL(head);


    }

    public static Node converToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover= head;
        for(int i=1; i<arr.length ;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }


    public static void printLL(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node deleteHead(Node head){
        head=head.next;
        return head;
    }

    public static Node deleteTail(Node head){
        Node temp = head;
        if(temp.next == null) return null;

        while (temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;

        return head;
    }


    public static Node deleteKthElement(Node head, int k){
        if(k==1){
            head=head.next;
            return head;
        }
        Node prev= null;
        int count=0;
        Node temp = head;
        while(temp !=null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
            }
            prev = temp;
            temp=temp.next;
        }
        return head;
    }

    public static Node deleteElement(Node head, int data){
        if(data==head.data){
            head=head.next;
            return head;
        }
        Node prev= null;
        Node temp = head;
        while(temp !=null){

            if(temp.data == data){
                prev.next = prev.next.next;
            }
            prev = temp;
            temp=temp.next;
        }
        return head;
    }

    public  static  Node insertAtHead(Node head, int data){
        Node node = new Node(data);
        node.next = head;
        return node;
    }

    public static Node insertAtLast(Node head, int data){
        Node node = new Node(data);

        Node temp = head;
        while (temp.next!= null){
            temp=temp.next;
        }
        temp.next=node;

        return head;
    }

    public static Node insertAtKthPosition(Node head, int k, int data){
        Node node = new Node(data);
        if(k==1){
            node.next=head;
            return node;
        }
        Node temp = head;
        int count=0;
        while (temp != null){
            count++;
            if(count == k-1){
                node.next=temp.next;
                temp.next=node;
                break;
            }


            temp=temp.next;


        }
        return head;
    }
}





class Node{
    int data;
    Node next;


    Node(){
        this.data=0;
        this.next=null;
    }

    Node(int data){
        this.data=data;
        this.next=null;
    }

    Node(int data, Node next){
        this.data=data;
        this.next = next;
    }
}


