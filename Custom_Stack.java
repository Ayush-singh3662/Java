import java.util.ArrayList;

public class Custom_Stack {
    public static void main(String[] args) {
        // Stack stack = new Stack();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // // System.out.println(stack.peek());
        // while(!stack.isEmpty()) {
        //     System.out.println(stack.pop());
        // }
        StackLL stack = new StackLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

class Stack {
    ArrayList<Integer> list = new ArrayList<>();
    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void push(int data) {
        list.add(data);
    }

    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        int removed = list.get(list.size()-1);
        list.remove(list.size()-1);
        return removed;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return list.get(list.size()-1);
    }
}

class StackLL {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node node = new Node(data);
        if(isEmpty()) {
            head = node;
            return ;
        }
        node.next = head;
        head = node;
    }

    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        int removed = head.data;
        head = head.next;
        return removed;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return head.data;
    }
}