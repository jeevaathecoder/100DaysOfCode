package Day48;

public class QueueImplementation {
    public class Solution {
        class Queue {
            int front, rear;
            int []arr;

            Queue() {
                front = 0;
                rear = 0;
                arr = new int[100001];
            }
            public void enqueue(int e) {
                arr[rear]=e;
                rear=rear+1;
            }
            public int dequeue() {
                if(rear==front){
                    return -1;
                }
                int k=arr[front];
                front=front+1;

                return k;
            }

        }

    }
}
