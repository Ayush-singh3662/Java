public class Doubly_LinkedList {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(0);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(6);
        // list.display();
        list.insert(17, 3);
        list.display();
        list.deleteLast();
        list.display();
    }
}

class DLL {
    private Node head;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            head.next = null;
            head.prev = null;
            return ;
        }
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
        last = node;
    }

    private Node get(int index) {
        Node temp = head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void insert(int value, int index) {
        Node node = new Node(value);
        Node temp = get(index-1);
        temp.next.prev = node;
        node.prev = temp;
        node.next = temp.next;
        temp.next = node;
    }

    private Node find(int value) {
        Node temp = head;
        while(temp != null) {
            if(temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        
        return null;
    }

    public void insertAfter(int after, int value) {
        Node node = new Node(value);
        Node temp = find(after);
        node.prev = temp;
        node.next = temp.next;
        temp.next = node;
        if(node.next != null) {
            node.next.prev = node;
        }
    }

    public void deleteFirst() {
        head = head.next;
        head.prev = null;
        // size--;
    }

    public void deleteLast() {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;
        // size--;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while(temp != null) {
            System.out.print(temp.value+"->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");
        System.out.println("Print in reverse");
        while(last != null) {
            System.out.print(last.value+"<-");
            last = last.prev;
        }
        System.out.println("Begin");
    }

    private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
