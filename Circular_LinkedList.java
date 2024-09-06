public class Circular_LinkedList {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        list.delete(3);
        list.display();
    }
}

class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    

    public void insert(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
            return ;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void display() {
        Node temp = head;
        if(head != null) {
            do {
                System.out.print(temp.value+"->");
                temp = temp.next;
            } while(temp != head);
            System.out.println("Head");
        }
    }

    public void delete(int value) {
        Node temp = head;
        if(temp == null) {
            return ;
        }
        if(temp.value == value) {
            head = head.next;
            tail.next = head;
            return ;
        }
        do {
            // Node node = temp.next;
            // if(node.value == value) {
            //     temp.next = node.next;
            //     break;
            // }
            if(temp.next.value == value) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        } while(temp != head);
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
