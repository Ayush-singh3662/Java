public class Custom_Queue {
    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        while(!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}

class Queue {
    int[] arr;
    int size;
    int rear;

    Queue(int n) {
        arr = new int[n];
        rear = 0;
        size = 0;
    }
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(size == arr.length) {
            return true;
        }
        return false;
    }

    public void insert(int x) {
        if(isFull()) {
            System.out.println("Queue is Full");
            return ;
        }
        arr[rear++] = x;
        size++;
    }

    public int remove() {
        if(isEmpty()) {
            return -1;
        }
        int removed = arr[0];
        rear--;
        size--;
        for(int i=1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
        return removed;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return arr[0];
    }
}

class QueueLL {
    class Node {
        int data;
        Node next;
        Node() {
            this.next = null;
        }
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = tail = node;
            return ;
        }
        tail.next = node;
        tail = node;
    }

    public int remove() {
        if(isEmpty()) {
            return -1;
        }
        int removed = head.data;
        if(head == tail) {
            head = tail = null;
        }
        else {
            head = head.next;
        }
        return removed;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.data;
    }
}