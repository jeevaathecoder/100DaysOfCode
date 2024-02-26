package Day56;

public class CirclularQueue {
    int[] data;
    private static final int DEFAULT_CAPACITY = 10;

    int end=0;
    int front=0;
    int size=0;
    public CirclularQueue(int size){
        this.data=new int[size];
    }

    public boolean IsFull(){
        return size==data.length;
    }

    public boolean IsEmpty(){
        return size==0;
    }

    public boolean insert(int item){
        if(IsFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(IsEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(IsEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }
    public void display(){
        for(int i=front; i<size; i++){
            System.out.print(data[i]+" <-");
        }
        System.out.println("END");
    }
}

class Demo{
    public static void main(String[] args) throws Exception{
        CirclularQueue queue = new CirclularQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.display();
        System.out.println();

        System.out.println(queue.remove());
            System.out.println(queue.remove());
            System.out.println(queue.remove());
            System.out.println(queue.remove());
            System.out.println(queue.remove());

    }
}
