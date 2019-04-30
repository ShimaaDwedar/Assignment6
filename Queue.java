package eg.edu.alexu.csd.datastructure.queue;

public class Queue {
    int n;
    int front=-1;
    int tail=-1;
    Object ArrQue[];
    public Queue (int no) {
        this.n = no;
        ArrQue=new Object [n];
    }
    
    public void enqueue(Object item) {
        if ((tail+1) % n == front) {
            System.out.println("The queue is full");
            return;
        }
        else if (isEmpty()) {
            front=0;
            tail=0;
            ArrQue[tail] = item;
        }else {
            tail = (tail + 1) % n;
        }
        ArrQue[tail] = item;
    }
    
    public boolean isEmpty() {
        boolean isEmpty = false;
        if (front == -1 && tail == -1) {
            isEmpty = true;
        }
        return isEmpty;
    }
}
