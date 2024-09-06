public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.push(8);
        queue.push(9);
        queue.push(1);
        queue.push(2);
        queue.push(5);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        queue.display();
        System.out.println();
        DynamicQueue queue2 = new DynamicQueue(5);
        queue2.push(8);
        queue2.push(9);
        queue2.push(1);
        queue2.push(2);
        queue2.push(5);
        queue2.push(67);
        queue2.push(50);
        System.out.println(queue2.peek());
        System.out.println(queue2.pop());
        queue2.display();
    }
}

class CustomQueue {
    protected int[] data;
    private static int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean push(int item) throws Exception {
        if(isFull()) {
            throw new Exception("FullQueueException");
        }
        data[++ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("EmptyQueueException");
        }
        int removed = data[0];
        for(int i=1; i<=ptr; i++) {
            data[i-1] = data[i];
        }
        return removed;
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("EmptyQueueException");
        }
        return data[0];
    }

    public void display() {
        for(int i=0; i<ptr; i++) {
            System.out.print(data[i]+" ");
        }
    }
}

class DynamicQueue extends CustomQueue {
    public DynamicQueue() {
        super();
    }
    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(isFull()) {
            int[] temp = new int[data.length*2];
            for(int i=0; i<data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        data[++ptr] = item;
        return true;
    }
}