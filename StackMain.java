public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.display();
        DynamicStack stack2 = new DynamicStack(5);
        stack2.push(8);
        stack2.push(9);
        stack2.push(2);
        stack2.push(12);
        stack2.push(14);
        stack2.push(78);
        System.out.println(stack2.peek());
        System.out.println(stack2.pop());
        stack2.display();
    }
}

class CustomStack {
    protected int[] data;
    int ptr = -1;
    private static final int DEFAULT_SIZE = 10;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
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
            throw new Exception("FullStackException");
        }
        data[++ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("EmptyStackException");
        }
        int removed = data[ptr--];
        return removed;
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("EmptyStackException");
        }
        return data[ptr];
    }

    public void display() {
        for(int i=0; i<=ptr; i++) {
            System.out.print(data[i] + " ");
        }
    }
}

class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
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