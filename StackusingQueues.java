import java.util.*;
import java.util.Queue;

public class StackusingQueues {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.add(1);
        s.add(2);
        s.add(3);
        while(!s.isEmpty()) {
            System.out.println(s.remove());
        }
    }
}

class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    MyStack() {
        q1= new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void add(int x) {
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        q1.add(x);
        while(!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

    public int remove() {
        if(isEmpty()) {
            return -1;
        }
        return q1.remove();
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return q1.peek();
    }
}