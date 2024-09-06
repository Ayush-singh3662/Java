import org.w3c.dom.Node;

public class Singly_LinkedList {
    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(4);
        // list.insertFirst(5);
        // list.insertFirst(8);
        // list.display();
        // list.insertLast(17);
        // // list.display();
        LL list2 = new LL();
        list2.insertLast(0);
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(3);
        list2.insertLast(4);
        list2.insertLast(5);
        // list2.display();
        list2.insert(17, 3);
        // list2.display();
        // System.out.println(list2.deleteFirst());
        // list2.display();
        // System.out.println(list2.deleteLast());
        // list2.display();
        // System.out.println(list2.delete(2));
        // list2.display();
        // System.out.println(list2.find(12));
        list2.delete(0);
        list2.display();
        
        list2.recursion(75, 0);
        list2.display();
    }
}

class LL {
    private Node head;
    private Node tail;
    private int size = 0;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value) {
        if(tail == null) {
            insertFirst(value);
            return ;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int value, int index) {
        if(index == 0) {
            insertFirst(value);
            return ;
        }
        if(index == size) {
            insertLast(value);
            return ;
        }
        Node temp = head;
        for(int i=1; i<index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while(head != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for(int i=0; i<index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if(size <= 1) {
            deleteFirst();
        }
        int val = tail.value;
        Node node = get(size-2);
        tail = node;
        tail.next = null;
        return val;
    }

    public int delete(int index) {
        if(index == 0) {
            deleteFirst();
            return 0;
        }
        if(index == size-1) {
            deleteLast();
            return 0;
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void recursion(int value, int index) {
        if(index == 0) {
            Node node = new Node(value);
            node.next = head;
            head = node;
            return ;
        }
        recursion(value, index, head);
    }

    private Node recursion(int value, int index, Node node) {
        if(index == 1) {
            Node temp = new Node(value);
            temp.next = node.next;
            node.next = temp;
            return temp;
        }
        return recursion(value, index-1, node.next);
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}