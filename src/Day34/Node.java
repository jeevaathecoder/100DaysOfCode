package Day34;

import java.util.LinkedList;

public class Node {
        int data;
        public Node next;

        Node(int data , Node next){
            this.data=data;
            this.next=next;
        }

        public Node(int data){
            this.data=data; //34
            this.next=null; //null
        }
    }

    class Demo{
        public static void main(String[] args) {
           int[] arr= {34,56,73,21};
          Node head = convertArrayToLinkedList(arr);
          Node temp = head;

          while (temp != null){
              System.out.print(temp.data + "->");
              temp=temp.next;
          }
        }

        public static  Node convertArrayToLinkedList(int[] arr){
            Node head = new Node(arr[0]);
            Node mover= head;

            for(int i=1;i<arr.length;i++){
                Node temp= new Node(arr[i]);
                mover.next=temp;
                mover=temp;
            }
            return head;
        }

    }


