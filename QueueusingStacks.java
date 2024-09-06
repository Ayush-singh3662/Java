import java.util.Stack;

public class QueueusingStacks {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // System.out.println(q.peek());
        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}

class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public boolean isEmpty() {
        return s1.isEmpty();
    }
    public void add(int data) {
        s1.push(data);
        return ;
    }

    public int remove() {
        if(isEmpty()) {
            return -1;
        }
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int removed = s2.pop();
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return removed;
    }

    public int peek() {
        if(s1.isEmpty()) {
            return -1;
        }
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int top = s2.peek();
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return top;
    }
}