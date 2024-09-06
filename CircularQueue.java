public class CircularQueue {
    public static void main(String[] args) throws Exception {
        Main queue = new Main(5);
        queue.push(8);
        queue.push(7);
        queue.push(17);
        queue.push(0);
        queue.push(34);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        queue.display();
    }
}

class Main {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0, front = 0, size = 0;
    public Main() {
        this(DEFAULT_SIZE);
    }
    public Main(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean push(int item) throws Exception {
        if(isFull()) {
            throw new Exception("FullQueueException");
        }
        data[end++] = item;
        end %= data.length;
        size++;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("EmptyQueueException");
        }
        int removed = data[front++];
        front %= data.length;
        size--;
        return removed;
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("EmptyQueueException");
        }
        return data[front];
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Empty Queue");
            return ;
        }
        int i = front;
        do {
            System.out.print(data[i]+" ");
            i++;
            i %= data.length;
        } while(i != end);
    }
}