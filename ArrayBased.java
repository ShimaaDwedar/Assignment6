package eg.edu.alexu.csd.datastructure.queue.cs15_cs28_cs36;

public class ArrayBased implements IArrayBased {
    private int n;
    private int front = -1;
    private int tail = -1;
    Object ArrQue[];
    public ArrayBased (int no) {
      this.n = no;
      ArrQue = new Object [n];
    }
    public void enqueue (Object item) {
      if ((tail + 1) % n == front) {
        System.out.println("The queue is full");
        return;
      } else if (isEmpty()) {
        front = 0;
        tail = 0;
        ArrQue[tail] = item;
      } else {
        tail = (tail + 1) % n;
      }
      ArrQue[tail] = item;
    }
    public Object dequeue() {
      if (isEmpty()) {
        throw new NullPointerException("The queue is empty");
      } else if (front == tail) {
        Object temp1 = ArrQue[front];
        ArrQue[front] = null;
        front = -1;
        tail = -1;
        return temp1;
      } else {
        Object temp = ArrQue[front];
        ArrQue[front] = null;
        front = (front + 1) % n;
        return temp;
      }
    }
    public boolean isEmpty() {
      boolean isEmpty = false;
      if (front == -1 && tail == -1) {
        isEmpty = true;
      }
      return isEmpty;
    }
    public int size() {
        if ((tail == -1) && (front == -1)) {
          return 0;
        } else {
          return ((n - front + tail) % n) + 1;
        }
    }}
