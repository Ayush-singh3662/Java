import java.util.*;

public class Stack_QueueusingDeque {
    public static void main(String[] args) {
        Stack_Deque stack = new Stack_Deque();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        while(!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
        System.out.println();

        Queue_Deque queue = new Queue_Deque();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.peek());
        while(!queue.isEmpty()) {
            System.out.print(queue.remove()+" ");
        }
    }
}

class Stack_Deque {
    Deque<Integer> deque = new LinkedList<>();

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public void push(int data) {
        deque.addLast(data);
    }

    public int pop() {
        return deque.removeLast();
    }

    public int peek() {
        return deque.getLast();
    }
}

class Queue_Deque {
    Deque<Integer> deque = new LinkedList<>();

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public void add(int data) {
        deque.addLast(data);
    }

    public int remove() {
        return deque.removeFirst();
    }

    public int peek() {
        return deque.getFirst();
    }
}